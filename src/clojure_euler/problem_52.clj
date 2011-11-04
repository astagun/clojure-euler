(ns clojure-euler.problem-52
  (:use [clojure-euler.utils]))


(defn problem-52 [m]
  (loop [n 1]
    (if (apply = (for [i m] (sort (digits (* i n)))))
      n
      (recur (inc n)))))

(defn solve-problem-52 []
  (println (time (problem-52 (range 2 7)))))

; TODO
; optimization:
;
; some multiples (e.g. 6x) might be so large that it's
; digit count (length) increases
; -> we should not check those
