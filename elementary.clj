(ns elementary)

;; Exerc 1 - Nothing but the truth
(def sol-1
  true)

;; Exerc 2 - Simple math
(def sol-2
  4)

;; Exerc 3 - Intro to strings
(def sol-3
  "HELLO WORLD")

;; Exerc 4 - Intro to lists
(def sol-4
  (list :a :b :c))

;; Exerc 5 - Lists: conj
(def sol-5
  '(1 2 3 4))

;; Exerc 6 - Intro to vectors
(def sol-6
  [:a :b :c])

;; Exerc 7 - Vectors: conj
(def sol-7
  [1 2 3 4])

;; Exerc 8 - Intro to sets
(def sol-8
  #{:a :b :c :d})

;; Exerc 9 - Sets: conj
(def sol-9
  2)

;; Exerc 10 - Intro to maps
(def sol-10
  20)

;; Exerc 11 - Maps: conj
(def sol-11
  {:b 2})

;; Exerc 12 - Intro to sequences
(def sol-12
  3)

;; Exerc 13 - Sequences: rest
(def sol-13
  [20 30 40])

;; Exerc 14 - Intro to functions
(def sol-14
  8)

;; Exerc 15 - Double down
(def sol-15
  (partial * 2))

;; Exerc 16 - Hello Wolrd
(def sol-16
  #(srt "Hello, " % "!"))

;; Exerc 17 - Sequences: map
(def sol-17
  '(6 7 8))

;; Exerc 18 - Sequences: filter
(def sol-18
  '(6 7))

;; Exerc 35 - Local bindings
(def sol-35
  7)

;; Exerc 36 - Let it be
(def sol-36
  (
   ;; let [x 7 y 3 z 1]
   ))

;; Exerc 37 - Regular expressions
(def sol-37
  "ABC")

;; Exerc 64 - Intro to reduce
(def sol-64
  #(+ %1 %2))

;; Exerc 57 - Simple recursion
(def sol-57
  '(5 4 3 2 1))

;; Exerc 71 - Rearranging code
(def sol-71
  #(last %))

;; Exerc 68 - Recurring theme
(def sol-68
  [7 6 5 4 3])

;; Exerc 72 - Rearranging code
(def sol-72
  #(reduce + %))

;; Exerc 134 - A nil key
(def sol-134
  (not (%2 %1 true)))

;; Exerc 145 - For the win
(def sol-145
  '(1 5 9 13 17 21 25 29 33 37))

;; Exerc 162 - Logical falsity and truth
(def sol-162
  1)

;; Exerc 161 - Subset and superset
(def sol-161
  #{1 2})

;; Exerc 52 - Intro to destructuring
(def sol-52
  ;; [c e]
  )

;; Exerc 156 - Map defaults
(def sol-156
  #(apply hash-map (interleave %2 (repeat %1))))
