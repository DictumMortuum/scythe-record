(ns scythe-record.form
    (:require [reagent.core :as reagent :refer [atom]]
              [scythe-record.pouchdb :as pouch]
              [scythe-record.utils :as utils]))

(defn pre-save [state]
  (let [doc (:play @state)]
    (-> doc
        (assoc :objectives (remove nil? [(:objective1 doc)
                                         (:objective2 doc)
                                         (:objective3 doc)
                                         (:objective4 doc)
                                         (:objective5 doc)
                                         (:objective6 doc)]))
        (utils/generate-doc)
        (#(pouch/post-doc (:db @state) %)))))

(defn post-save [state x]
  (println x))

(defn drop-down-input [label selected options]
  [:div
   [:label label]
   [:select.u-full-width {:value @selected
                          :on-change #(reset! selected (-> % .-target .-value))}
    (for [o @options]
      ^{:key o} [:option {:value o} o])]])

(defn simple-input [label option]
  [:div
   [:label label]
   [:input.u-full-width {:type "number"
                         :placeholder "0"
                         :value @option
                         :on-change #(reset! option (-> % .-target .-value))}]])

(defn checkbox [label option]
  [:label
   [:input {:type "checkbox"
            :on-change #(reset! option (-> % .-target .-value))}]
   [:span.label-body label]])

(defn render [state]
  (fn []
    (let [wealth     (reagent/cursor state [:play :wealth])
          popularity (reagent/cursor state [:play :popularity])
          board      (reagent/cursor state [:play :board])
          country    (reagent/cursor state [:play :country])
          player     (reagent/cursor state [:play :player])
          rounds     (reagent/cursor state [:play :rounds])
          objective1 (reagent/cursor state [:play :objective1])
          objective2 (reagent/cursor state [:play :objective2])
          objective3 (reagent/cursor state [:play :objective3])
          objective4 (reagent/cursor state [:play :objective4])
          objective5 (reagent/cursor state [:play :objective5])
          objective6 (reagent/cursor state [:play :objective6])
          position   (reagent/cursor state [:play :position])
          player#    (reagent/cursor state [:play :players])
          players    (reagent/cursor state [:players])
          boards     (reagent/cursor state [:boards])
          countries  (reagent/cursor state [:countries])
          objectives (reagent/cursor state [:objectives])]
      [:div
       [:div.row
        [:p "Items that've not been altered won't be recorded. Use this feature if certain items are not applicable (e.g. you don't remember how many rounds lasted your game, or you won with 5 completed objectives.)"]]
       [:div.row
        [:div.four.columns
         (simple-input "Total score" wealth)]
        [:div.four.columns
         (simple-input "Popularity" popularity)]
        [:div.four.columns
         (simple-input "Rounds" rounds)]]
       [:div.row
        [:div.four.columns
         (drop-down-input "Player" player players)]
        [:div.four.columns
         (drop-down-input "Board" board boards)]
        [:div.four.columns
         (drop-down-input "Country" country countries)]]
       [:div.row
        [:div.four.columns
         (drop-down-input "Objective 1" objective1 objectives)]
        [:div.four.columns
         (drop-down-input "Objective 2" objective2 objectives)]
        [:div.four.columns
         (drop-down-input "Objective 3" objective3 objectives)]]
       [:div.row
        [:div.four.columns
         (drop-down-input "Objective 4" objective4 objectives)]
        [:div.four.columns
         (drop-down-input "Objective 5" objective5 objectives)]
        [:div.four.columns
         (drop-down-input "Objective 6" objective6 objectives)]
        [:div.row
         [:div.four.columns
          (simple-input "Position (winner=1, 2nd=2, etc)" position)]
         [:div.four.columns
          (simple-input "# of players" player#)]]]
       [:div.row
        [:div.four.columns
         [:input.button-primary {:type "submit"
                                 :value "Submit"
                                 :on-click #(utils/animated state pre-save post-save)}]]
        [:div.four.columns
         (if (:animation @state) (utils/loading))]]])))
