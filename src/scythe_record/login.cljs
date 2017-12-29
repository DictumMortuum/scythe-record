(ns scythe-record.login
    (:require [reagent.core :as reagent :refer [atom]]
              [scythe-record.pouchdb :as pouch]
              [scythe-record.utils :as utils]))

(defn pre-login [state]
  (pouch/login (:db @state) (:user @state) (:pass @state)))

(defn post-login [state result]
  (swap! state update-in [:logged] (fn [] (:ok result))))

(defn render [state]
  (fn []
    (let [user (reagent/cursor state [:user])
          pass (reagent/cursor state [:pass])]
      [:div
       [:div.row
        [:div.six.columns
         [:label "Username"]
         [:input.u-full-width {:type "text"
                               :placeholder ""
                               :value @user
                               :on-change #(reset! user (-> % .-target .-value))}]]
        [:div.six.columns
         [:label "Password"]
         [:input.u-full-width {:type "password"
                               :placeholder ""
                               :value @pass
                               :on-change #(reset! pass (-> % .-target .-value))}]]]
       [:div.row
        [:div.six.columns
         [:input.button-primary {:type "submit"
                                 :value "Login"
                                 :on-click #(utils/animated state pre-login post-login)}]]
        [:div.six.columns
         (if (:animation @state) (utils/loading))]]])))
