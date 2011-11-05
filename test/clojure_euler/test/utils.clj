(ns clojure-euler.test.utils
  (:use [clojure-euler.utils])
  (:use [clojure.test]))

(deftest test-multiple?
  (is (= true (multiple? 10 5)))
  (is (= true (multiple? 9 3)))
  (is (= false (multiple? 9 4))))

(deftest test-combinations
  (is (= 10 (combinations 5 3)))
  (is (= 1144066 (combinations 23 10)))
  (is (= nil (combinations 3 5))))
