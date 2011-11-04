(ns clojure-euler.problem-52
  (:use [clojure-euler.utils]))


(defn problem-52 [m]
  (loop [n 1]
    (if (apply = (for [i m] (sort (digits (* i n)))))
      n
      (recur (inc n)))))

(defn problem-52-solve []
  (println (time (problem-52 (range 2 7)))))

; possible optimization:
; some multiples (e.g. 6x) might be so large that its
; digit count (length) increases
; we should not check those
