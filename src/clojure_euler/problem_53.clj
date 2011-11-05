(ns clojure-euler.problem-53
  (:use [clojure-euler.utils]))


(defn problem-53 [n]
  (count 
    (filter #(> % 1e6) 
            (flatten 
              (map #(for [r (range 1 (inc %))] (combinations % r)) 
                   (range 1 (inc n)))))))

(defn solve-problem-53 []
  (println (time (problem-53 100))))
