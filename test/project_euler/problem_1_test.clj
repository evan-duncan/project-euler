(ns project-euler.problem-1-test
  (:require  [clojure.test :as t]
             [project-euler.problem-1 :as p]))

(t/deftest sum-multiples-of-3-or-5
  (t/testing "The sum of all natural numbers below 10 that are multiples of 3 or 5 is 23"
    (t/is (= 23 (p/sum (range 10))))))
