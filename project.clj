(defproject lighthouse "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.10.439"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :cljsbuild {:builds
              [{:id "default"
                :source-paths ["src"]
                :compiler {:libs ["libs/baz/input.js" "libs/input.js"]
                           :language-in :ecmascript6
                           :optimizations :advanced
                           :pretty-print true}}]})
