(ns clojure-euler.test.utils
  (:use [clojure-euler.utils])
  (:use [clojure.test]))

(deftest test-multiple?
  (is (= true (multiple? 10 5)))
  (is (= true (multiple? 9 3)))
  (is (= false (multiple? 9 4))))

