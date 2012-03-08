




(println

 (

  (fn  part [n s]

    (if (empty? s)
      s

      (if (< (count s) n)
        ()
    
        (cons (take n s) (part n (drop n s)))
        )

)
    )
  
3 (range 8)




)

)
