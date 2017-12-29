(ns scythe-record.utils
    (:require [reagent.core :as reagent :refer [atom]]
              [cljs.core.async :as async :refer [put! <! >! timeout chan]])
    (:require-macros [cljs.core.async.macros :refer [go go-loop]]))

(defn generate-id []
  (.toISOString (js/Date.)))

(defn generate-doc [col]
  (assoc col :_id (generate-id)))

(defn animated [state action consequences]
  (let [animation (reagent/cursor state [:animation])]
    (reset! animation true)
    (go
      (->> (action state)
           (<!)
           (consequences state))
      (reset! animation false))))

(defn loading []
  [:div.la-ball-grid-pulse
   [:div]
   [:div]
   [:div]
   [:div]
   [:div]
   [:div]
   [:div]
   [:div]
   [:div]])
