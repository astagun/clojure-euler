(ns clojure-euler.problem-48
  (:use [clojure-euler.utils]))

(defn problem-48 [n]
  (apply str 
    (take-last 10 
      (digits 
        (reduce + (map #(.pow (biginteger %) %) 
                       (range 1 (inc n))))))))

(defn solve-problem-48 []
  (println (time (problem-48 1000))))
