




(println

 (

  (fn primes  [n]
    (take n (filter #(not-any?  (fn [a]  (zero? (rem %  a)) )   (range 2 (dec %) ) ) (iterate inc 2) ) )
    )

  2



)

)

