(ns clojure-euler.test.problems
  (:use [clojure-euler.problem-1])
  (:use [clojure-euler.problem-6])
  (:use [clojure-euler.problem-16])
  (:use [clojure-euler.problem-20])
  (:use [clojure-euler.problem-48])
  (:use [clojure-euler.problem-52])
  (:use [clojure.test]))


(deftest test-problem-1
  (is (= 23 (problem-1 10))))

(deftest test-problem-6
  (is (= 2640 (problem-6 10))))

(deftest test-problem-20
  (is (= 27 (problem-20 10))))

(deftest test-problem-16
  (is (= 26 (problem-16 15))))

(deftest test-problem-48
  (is (= "0405071317" (problem-48 10))))

(deftest test-problem-52
  (is (= 125874 (problem-52 '(1 2)))))

