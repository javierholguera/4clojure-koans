
;; Exec 19 - Last element
(def sol-19
  (comp first reverse))

;; Exec 20 - Penultimate element
(def sol-20
  (comp first rest reverse))

;; Exec 21 - Nth element
(def-21
  #(->> %1 (drop %2) first))

;; Exerc 22 - Count a sequence
(def sol-22
  #(reduce (fn [acc n] (inc acc)) 0 %))

;; Exerc 23 - Reverse a sequence
(def sol-23
  (reduce conj '()))

;; Exec 24 - Sum it all up
(def sol-24
  (apply +))

;; Exec 25 - Find the odd numbers
(def sol-25
  (filter odd?))

;; Exec 26 - Fibonacci sequence
(def sol-26
  #(take %
         (map first
              (iterate
               (fn [[i1 i2]] [i2 (+ i1 i2)])
               [1 1]))))

;; Exer 27 - Palindrome detector
(def sol-27
  (fn [coll] (= (seq coll) (reverse coll))))

;; Exerc 28 - Flatten a sequence
(def sol-28
  (fn my-flatten [x]
    (if (coll? x)
      (mapcat my-flatten x)
          [x])))

;; Exerc 29 - Get the caps
(def sol-29
  #(apply str (re-seq #"[A-Z]" %)))

;; Exerc 30 - Compress a sequence
(def sol-30
  (fn [coll]
    (map first (partition-by identity coll))))

;; Exerc 31 - Pack a sequence
(def sol-31
  (partition-by identity))

;; Exerc 32 - Duplicate a sequence
(def sol-32
  (fn [coll]
    (mapcat #(list % %) coll)))

;; Exerc 33 - Replicate a sequence
(def sol-33
  (fn [coll times]
    (mapcat #(repeat times %) coll)))

;; Exerc 34 - Implement range
(def sol-34
  (fn [from to] (take-while #(< % to) (iterate inc from))))

;; Exerc 38 - Maximum value
(def sol-28
  (fn [& args] (-> args sort last)))

;; Exerc 39 - Interleave two seqs
(def sol-39
  (mapcat list))

;; Exerc 40 - interpose a seq
(def sol-40
  (fn [pad coll]
    (-> coll
        (interleave (repeat pad))
        drop-last)))

;; Exerc 41 - Drop every nth item
(def sol-41
  (fn [coll drop-index]
    (mapcat (partial take (dec drop-index))
            (partition-all drop-index coll))))

;; Exerc 42 - Factorial fun
(def sol-42
  #(apply * (range 1 (inc %))))

;; Exerc 45 - Intro to iterate
(def sol-45
  '(1 4 7 10 13))

;; Exerc 47 - Contains yourself
(def sol-47
  4)

;; Exerc 48 - Intro to some
(def sol-48
  6)

;; Exerc 49 - split a sequence
(def sol-49
  (juxt take drop))

;; Exerc 51 - Intro to destructuring
(def sol-51
  [1 2 3 4 5])

;; Exerc 61 - map construction
(def sol-61
  (fn [coll1 coll2]
    (apply sorted-map (interleave coll1 coll2))))

;; Exerc 62 - Reimplement iterate
(def sol-62
  (fn my-iterate [f x]
    (lazy-cat [x] (my-iterate f (f x)))))



;; def 81 - set intersection
(def sol-81
  (fn [s1 s2]
    (set (filter s1 s2))))

;; Exerc 88 - Symmetric difference
(def sol-88
  (fn [s1 s2] (clojure.set/difference (clojure.set/union s1 s2) (clojure.set/intersection s1 s2))))

