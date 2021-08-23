(ns learn_deps.core
  (:require [compojure.core :refer [defroutes GET POST]]
            [compojure.route :as route]
            [org.httpkit.server :refer [run-server]]
            [cheshire.core :as json]))

(defroutes app
  (GET "/" [] "Hello world"))

(defn -main []
  ;    (println "Goodbye World!")
  (run-server app {:port 4000})
  )

(comment
  (-main
   ;; => #function[learn-deps.core/-main]
)
  )