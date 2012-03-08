

(
 (fn mr  [l] 

   (if (empty? l)
     l
   
     (cons (last l) (mr (butlast l)) )
     )


	
   ) '(1 2 3 4) )