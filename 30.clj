

(println

(

(fn compress   [l]

  (if (empty? l)
    l
    
  
  (cons

   (first l)

   (compress (drop-while (partial = (first l)) l))
 )  


)

) [1 1 2 1 1 1 3 3]

)

)