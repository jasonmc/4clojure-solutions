

(println

(

(fn pack   [l]

  (if (empty? l)
    l
    
  
  (cons

   (take-while (partial = (first l)) l)

   (pack (drop-while (partial = (first l)) l))
 )  


)

) [1 1 2 1 1 1 3 3]

)

)