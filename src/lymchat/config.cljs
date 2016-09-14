(ns lymchat.config
  (:require [lymchat.util :refer [development?]]))

(defn api-host
  []
  (if (development?)
    "http://192.168.1.114:8089"
    "https://api.lymchat.com"))

(defonce xxxxx (atom nil))
