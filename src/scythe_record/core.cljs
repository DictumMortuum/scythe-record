(ns scythe-record.core
    (:require [reagent.core :as reagent :refer [atom]]
              [cljs.core.async :as async :refer [put! <! >! timeout chan]]
              [scythe-record.pouchdb :as db]
              [scythe-record.form :as form]
              [scythe-record.login :as login])
    (:require-macros [cljs.core.async.macros :refer [go go-loop]]))

(enable-console-print!)

(defonce app-state (atom {:db         (db/create-db "https://dictummortuum.cloudant.com/scythe" {:skip_setup true})
                          :user       ""
                          :pass       ""
                          :logged     false
                          :animation  false
                          :countries  ["" "Saxony" "Rusviet" "Nordic" "Polania" "Crimea" "Albion" "Togawa"]
                          :boards     ["" "Industrial" "Engineering" "Patriotic" "Mechanical" "Agricultural" "Innovative" "Militant"]
                          :objectives ["" "Upgrade" "Deploy" "Build" "Enlist" "Worker" "Objective" "Battle" "Power" "Popularity"]
                          :players    ["" "Dimitris" "Panagiotis" "Elena" "Kostas" "Kalliopi" "Giorgos"]
                          :play       {}}))

(defn check-cookie []
  (go
    (-> (db/session (:db @app-state))
        (<!)
        (:info)
        (:authenticated)
        (= "cookie"))))

(swap! app-state update-in [:logged] check-cookie)

(defn main []
  (fn []
    [:div
     (if (:logged @app-state)
       [form/render  app-state]
       [login/render app-state])]))

(reagent/render-component [main] (. js/document (getElementById "app")))
