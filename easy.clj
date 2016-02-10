
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

;; Exerc 28

;; Exerc 39 - Interleave two seqs
(def sol-39
  (mapcat list))

;; def 47 - Contains yourself
(def sol-47
  4)




(comment
  (def my-seq [1 2 3 4 5])

  (conj '(1 2 3) 4)

  ( #(reduce (fn [acc n] (conj acc n)) '() (list %) [1 2 3 4 5])

 )
