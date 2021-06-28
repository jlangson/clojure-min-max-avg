(ns compute)

(defn avg [ints]
  (/ (reduce + 0 ints) (count ints)))

(defn compute [ints]
  (let [minimum (apply min ints)
        maximum (apply max ints)
        average (avg ints)]
    ["min=" minimum, "max=" maximum, "average=" average]))

(def inputOne [1 2 3 4 5])
(def inputTwo [-5 0 3 8])
(def maxAndOthers [Integer/MAX_VALUE -8 0 33])
(def minAndOthers [Integer/MIN_VALUE -8 0 33])


(defn -main [& args]
  (println (compute inputOne))
  (println (compute inputTwo))
  (println (compute maxAndOthers))
  (println (compute minAndOthers)))