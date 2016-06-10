(defproject clojusc/mesomatic-example "0.1.0-SNAPSHOT"
  :description "A Clojure Port of the Mesos Java Example"
  :url "https://github.com/clojusc/mesomatic-example"
  :license {
    :name "Eclipse Public License"
    :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.1"]
                 [clojusc/twig "0.2.1"]
                 [spootnik/mesomatic "0.28.0-r0"]
                 [spootnik/mesomatic-async "0.28.0-r0"]
                 [leiningen-core "2.5.3"]]
  :plugins [[lein-codox "0.9.1"]
            [lein-simpleton "1.3.0"]]
  :aliases {"mesomatic" ["run" "-m" "clojusc.mesomatic.example.core"]}
  :mesomatic-example {
    :log-namespaces [clojusc.mesomatic.example]
    :log-level :debug}
  :codox {
    :project {
      :name "mesomatic-example"
      :description "A Clojure Port of the Mesos Java Example"}
    :namespaces [#"^clojusc.mesomatic.example\."]
    :output-path "docs/build"
    :doc-paths ["docs"]
    :metadata {
      :doc/format :markdown
      :doc "Documentation forthcoming"}}
  :profiles {
    :dev {
      :source-paths ["dev-resources/src"]
      :repl-options {:init-ns clojusc.mesomatic.example.dev}
    }
    })
