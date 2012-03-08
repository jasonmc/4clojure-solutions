

(
 (fn getn

   ([l,n] (getn l n 0) )

   ([l,n,i]
      (if (= n i)
        (first l)
        (getn (rest l) n (+ i 1))
        )
      )

	
   )

 '(4 5 6 7) 2)
