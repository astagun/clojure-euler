(ns clojure-euler.problem-6)

(defn sum-of-squares [r]
  (reduce + (map #(Math/pow % 2) r)))

(defn square-of-sums [r]
  (Math/pow (reduce + r) 2))

(defn problem-6 [n]
  (let [r (range 1 (inc n))]
    (int (- (square-of-sums r) 
            (sum-of-squares r)))))

(defn solve-problem-6 []
  (println (time (problem-6 100))))
