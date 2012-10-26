(defproject org.clojars.gnarmis/snowball-stemmer "0.1.1-SNAPSHOT"
  :description "Wrapper around the Snowball stemmer algorithm."
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :source-path "src/clj"
  :java-source-path "src/java"
  :aot [stemmer.snowball])
