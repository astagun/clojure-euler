(ns clojure-euler.problem-20
  (:use [clojure-euler.utils]))


(defn problem-20 [n]
  (reduce + (digits (factorial n))))

(defn solve-problem-20 []
  (println (time (problem-20 100))))

