(defproject alekcz/datahike-starter "0.1.0-SNAPSHOT"
  :description "A beginning friendly space for getting started with datahike and datascript from clojure."
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [io.replikativ/datahike "0.3.6"]]
  :main ^:skip-aot datahike-starter.core
  :repl-options {:init-ns datahike-starter.core}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
