(ns ctci-clojure.ch01_arrays_strings.ch01_q01)

(defn is-unique [s] 
  "Given a string s, returns true if s has all unique characters, and false otherwise."
  (loop [charset #{}
         chr (first s)
         remainingchars (rest s) ]
         (if (nil? chr)
           true
           (if (contains? charset chr)
             false
             (recur (conj charset chr)
                    (first remainingchars)
                    (rest remainingchars))))))
