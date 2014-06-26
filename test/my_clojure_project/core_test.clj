(ns my-clojure-project.core-test
  (:require [clojure.test :refer :all]
            [my-clojure-project.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest test33
  (testing "Problem #33"
    (is (= ( replicate [1 2 3] 2) '(1 1 2 2 3 3)))
  )
)
