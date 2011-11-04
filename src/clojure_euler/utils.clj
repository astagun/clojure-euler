(ns clojure-euler.utils)

(defn multiple? [n mult]
  (zero? (mod n mult)))

(defn digits [^BigInteger n]
  (loop [c () r n]
    (if (zero? r)
      c
      (let [digit (int (mod r 10))
            r1 (/ r 10N)]
        (recur (cons digit c) (bigint (/ r 10)))))))

(defn factorial [n]
  (loop [acc 1N n n]
    (if (zero? n)
      acc
      (recur (* acc n) (dec n)))))

