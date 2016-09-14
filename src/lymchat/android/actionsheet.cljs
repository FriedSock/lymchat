(ns lymchat.android.actionsheet
  (:require [reagent.core :as r]
            [re-frame.core :refer [subscribe dispatch]]
            [lymchat.styles :refer [styles]]
            [lymchat.shared.ui :refer [text view image touchable-highlight colors modal button]]
            [lymchat.util :as util]))

(defn action-sheet-cp
  []
  (prn "enter action sheet")
  (let [visible (r/atom true)]
    [modal {:animationType "fade"
            :transparent true
            :visible @visible}
     [view {:flex 1
            :padding 30
            :align-items "center"}
      [view {:style {:flex 1
                     :margin-left 50
                     :margin-right 50
                     :margin-top 100
                     :margin-bottom 100
                     }}
       [touchable-highlight {:style {:padding-left 20
                                     :padding-right 20
                                     :padding-top 8
                                     :padding-bottom 8
                                     :min-width 200}
                             :on-press #(do
                                          (prn "clicked")
                                          (reset! visible false))}
        [text "Leave"]]
       [touchable-highlight {:style {:padding-left 20
                                     :padding-right 20
                                     :padding-top 8
                                     :padding-bottom 8
                                     :min-width 200}
                             :on-press #(do
                                          (prn "clicked")
                                          (reset! visible false))}
        [text "Cancel"]]]]]))
