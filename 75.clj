



(println

 (

(fn totient [n]
  (if (= 1 n)
    1
  (letfn  [(gcd [a b]  (apply max (filter #(and (zero? (rem a %)) (zero? (rem b %) ))  (range 1 (inc(min a b))) )))]
    (count   (filter #(= 1 (gcd %  n )  )   (range 1 n))  )
    )
  )
  )  99

)

)

