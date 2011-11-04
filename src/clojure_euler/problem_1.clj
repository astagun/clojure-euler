(ns clojure-euler.problem-1
  (:use [clojure-euler.utils]))


(defn problem-1 [n]
  (reduce + (filter #(or (multiple? % 3)
                         (multiple? % 5)) 
                    (range 1 n))))

(defn problem-1-solve []
  (println (time (problem-1 1000))))
