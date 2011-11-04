(ns clojure-euler.test.problems
  (:use [clojure-euler.problem-1])
  (:use [clojure-euler.problem-20])
  (:use [clojure-euler.problem-52])
  (:use [clojure.test]))


(deftest test-problem-1
  (is (= 23 (problem-1 10))))

(deftest test-problem-20
  (is (= 27 (problem-20 10))))

(deftest test-problem-52
  (is (= 125874 (problem-52 '(1 2)))))

