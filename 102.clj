

(fn [x]

  (clojure.string/replace x #"-[a-z]" #(clojure.string/upper-case (second %1)))


  )

