



(println

 (

(fn  [s]

  (sort-by #(.toLowerCase %1) (re-seq #"\w+" s) )

  )

"Have a nice day."



)

)

