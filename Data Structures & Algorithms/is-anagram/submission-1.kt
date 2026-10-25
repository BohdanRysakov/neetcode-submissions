class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false 
        val countSChars = mutableMapOf<Char, Int>()
        val countTChars = mutableMapOf<Char, Int>()

        for(ch in s) {
            if (countSChars.containsKey(ch)) {
                countSChars[ch] = countSChars[ch]!! + 1
            } else {
                 countSChars[ch] = 1
            }
        }
         for(ch in t) {
          if (countTChars.containsKey(ch)) {
                countTChars[ch] = countTChars[ch]!! + 1
            } else {
                 countTChars[ch] = 1
            }
        }

        return countSChars == countTChars

    }
}
