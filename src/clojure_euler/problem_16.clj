(ns clojure-euler.problem-16
  (:use [clojure-euler.utils]))

(defn problem-16 [n]
  (reduce + (digits (.pow (biginteger 2) n))))

(defn solve-problem-16 []
  (println (time (problem-16 1000))))
