(ns learn_deps.core
  (:require [compojure.core :refer [defroutes GET POST]]
            [compojure.route :as route]
            [org.httpkit.server :refer [run-server]]
            [cheshire.core :as json]))

(defroutes app
  (GET "/" [] 
    ;"Hello world"
    {:status 200
     :headers {"Content-Type" "application/json"}
     :body (json/encode {:hello "world"})
     }
    ))

(defn start-server []
  (println "starting server on port 4000")
  (run-server app {:port 4000}))

(defn -main []
  ;    (println "Goodbye World!")
  ;(run-server app {:port 4000})
  (start-server)
  )

;; interactive dev

(defonce server (atom nil))

(defn start []
  (reset! server (start-server)))

(defn stop []
  (when @server
    (@server :timeout 100)))  

(defn restart [] 
  (stop)
  (start))    
;;  

(comment
  (-main
   ;; => #function[learn-deps.core/-main]
)
  )