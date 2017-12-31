(ns scythe-record.core
    (:require [reagent.core :as reagent :refer [atom]]
              [cljs.core.async :as async :refer [put! <! >! timeout chan]]
              [scythe-record.pouchdb :as db]
              [scythe-record.form :as form]
              [scythe-record.login :as login]
              [scythe-record.utils :as utils])
    (:require-macros [cljs.core.async.macros :refer [go go-loop]]))

(enable-console-print!)

(def title (utils/generate-name))
(def today (.toDateString (js/Date.)))

(defonce app-state (atom {:db          (db/create-db "https://dictummortuum.cloudant.com/scythe" {:skip_setup true})
                          :user        ""
                          :pass        ""
                          :logged      false
                          :animation   false
                          :countries   ["" "Saxony" "Rusviet" "Nordic" "Polania" "Crimea" "Albion" "Togawa"]
                          :boards      ["" "Industrial" "Engineering" "Patriotic" "Mechanical" "Agricultural" "Innovative" "Militant"]
                          :objectives  ["" "Upgrade" "Deploy" "Build" "Enlist" "Worker" "Objective" "Battle" "Power" "Popularity"]
                          :players     ["" "Dimitris" "Panagiotis" "Elena" "Kostas" "Kalliopi" "Giorgos"]
                          :resolutions ["" "Dejavu" "Mission Possible" "Factory Explosion" "Doomsday Clock"]
                          :aggressive  ["" "Toll" "Blietzkrieg"]
                          :passive     ["" "Drill" "Ferry"]
                          :games       [title]
                          :play        {:game title}}))

(defn check-cookie []
  (go
    (-> (db/session (:db @app-state))
        (<!)
        (:info)
        (:authenticated)
        (= "cookie"))))

(defn get-games []
  (let [games (reagent/cursor app-state [:games])]
    (go
      (->> (db/all-docs (:db @app-state) {:include_docs true})
           (<!)
           (:rows)
           (filter #(= (-> % :id js/Date. .toDateString) today))
           (map :doc)
           (map :game)
           (distinct)
           (remove nil?)
           (swap! app-state update-in [:games] into)))))

(swap! app-state update-in [:logged] check-cookie)
(get-games)

(defn main []
  (fn []
    [:div
     (if (:logged @app-state)
       [form/render  app-state]
       [login/render app-state])]))

(reagent/render-component [main] (. js/document (getElementById "app")))
