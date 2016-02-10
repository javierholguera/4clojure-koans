
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


;; Exerc 38 - Maximum value
(def sol-28
  (fn [& args] (-> args sort last)))


;; Exerc 34 -
(def sol-34
  (fn [from to]
    (take-while #(< % to) (iterate inc from))))

 

;; Exerc 39 - Interleave two seqs
(def sol-39
  (mapcat list))

;; def 47 - Contains yourself
(def sol-47
  4)

;; def 40 - interpose a seq
(def sol-40
  (fn [pad coll]
    (-> coll
        (interleave (repeat pad))
        drop-last)))

;; def 49 - split a sequence
(def sol-49
  (juxt take drop))

;; def 61 - map construction
(def sol-61
  (fn [coll1 coll2]
    (apply sorted-map (interleave coll1 coll2))))

;; def 81 - set intersection
(def sol-81
  (fn [s1 s2]
    (set (filter s1 s2))))

  
;; Exerc 88 - Symmetric difference
(def sol-88
  (fn [s1 s2] (clojure.set/difference (clojure.set/union s1 s2) (clojure.set/intersection s1 s2))))




(comment
  (def my-seq [1 2 3 4 5])

  (conj '(1 2 3) 4)

  ( #(reduce (fn [acc n] (conj acc n)) '() (list %) [1 2 3 4 5])

 )
