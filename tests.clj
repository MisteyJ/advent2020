(ns tests
  (:require [clojure.test :refer [deftest is]]
            [problems :as p]))

(deftest p1-test
  (is (= 980499 (p/p1-a)))
  (is (= 200637446 (p/p1-b))))

(deftest p2-test
  (is (= 515 (p/p2-a)))
  (is (= 711 (p/p2-b))))

(deftest p3-test
  (is (= 9406609920 (p/p3-b))))

(deftest p4-test
  (is (= 245 (p/p4-a)))
  (is (= 133 (p/p4-b))))

(deftest p5-test
  (is (= 44 (p/get-row "FBFBBFF")))
  (is (= 5 (p/get-column "RLR")))
  (is (= (p/find-seat "FBFBBFFRLR") [44 5]))
  (is (= 850 (p/p5-a)))
  (is (= 599 (p/p5-b))))

(deftest p6-test
  (is (= 6443 (p/p6-a)))
  (is (= 3232 (p/p6-b))))
