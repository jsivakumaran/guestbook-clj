(ns guestbook.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[guestbook started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[guestbook has shutdown successfully]=-"))
   :middleware identity})
