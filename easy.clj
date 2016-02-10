
;; Exerc 22 - Count a sequence
(def sol-22
  #(reduce (fn [acc n] (inc acc)) 0 %))

;; Exerc 23 - Reverse a sequence : TODO!!
(def sol-23
  (reduce conj '()))

;; Exerc 38 - Maximum value
(def sol-28
  (fn [& args] (-> args sort last)))


;; Exerc 34 -
(def sol-34
  (fn [from to]
    (take-while #(< % to) (iterate inc from))))

;; Exerc 28
 

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

  



(comment
  (def my-seq [1 2 3 4 5])

  (conj '(1 2 3) 4)

  ( #(reduce (fn [acc n] (conj acc n)) '() (list %) [1 2 3 4 5])

 )
