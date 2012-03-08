

(println

 (

(fn gcd [a b]

 (apply max (filter #(and (zero? (rem a %)) (zero? (rem b %) ))  (range 1 (inc(min a b))) ))

  )  2 4

)

)

