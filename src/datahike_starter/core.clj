(ns datahike-starter.core
    (:require [datahike.api :as d])    
  (:gen-class))

(def config {:store {:backend :mem}
             :schema-flexibility :read
             :keep-history? true})

(defn -main[& args]
  (println "Greetings mortal"))
