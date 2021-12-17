(ns project-euler.problem-1)

(defn sum [range]
  (apply + (filter #(or
                     (zero? (mod %1 3))
                     (zero? (mod %1 5)))
                   range)))
