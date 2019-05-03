(ns matcher-starter.core
  (:require [org.clojars.cognesence.breadth-search.core :refer :all]
            [org.clojars.cognesence.matcher.core :refer :all]
            [org.clojars.cognesence.ops-search.core :refer :all]))

(use 'clojure.java.io)

(defn readFirstLine
  [rdr]
  (with-open [rdr (reader "Input.txt")]
    (def firstLine (nth (line-seq rdr) (dec 1)))
    (let [fLine firstLine] fLine)))

(defn readFile
  []
  (with-open [rdr (reader "Input.txt")]
    (def amount (readFirstLine rdr))
    (println (str amount "\n---"))
      (doseq [line (next(line-seq rdr))]
        (def charString(clojure.string/split line #""))
        (def charLineVector(map-indexed vector charString))
        ;(println charStringVector)
        (doseq [char charLineVector]
          (print char)
        )
          ;(print (if (= char "1") char nil))
        (println "")
      )
  )
)

(defn writeLine
  []
  (with-open [wrtr (writer "Output.txt" :append true)]
    (.write wrtr "\ntest2")))