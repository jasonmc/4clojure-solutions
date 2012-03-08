



(println

 (

(fn is-tree? [t]
  (or (nil? t) (and (coll? t) (= (count t) 3) (is-tree? (second t)) (is-tree? (last t))))
  )

;;'(:a (:b nil nil) nil)

;;'(:a (:b nil nil))

[1 nil [2 [3 nil nil] [4 nil nil]]]

)

)

