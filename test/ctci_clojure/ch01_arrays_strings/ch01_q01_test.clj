(ns ctci-clojure.ch01_arrays_strings.ch01_q01_test
  (:require [clojure.test :refer :all]
            [ctci-clojure.ch01_arrays_strings.ch01_q01 :refer :all]))

(deftest non-unique
  (testing "Non unique string should fail"
    (is (= false (is-unique "abcdefghe")))))

(deftest unique 
  (testing "unique string should pass"
    (is (= true (is-unique "abcdefghij")))))
