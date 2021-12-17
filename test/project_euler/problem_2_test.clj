(ns project-euler.problem-2-test
  (:require  [clojure.test :as t]
             [project-euler.problem-2 :as p]))

(t/deftest even-fibonacci-numbers
  (t/testing "The sum of even-valued terms in the Fibonacci sequence up to 10 terms is 44"
    (t/is (= 44 (p/even-fib-to 89)))))
