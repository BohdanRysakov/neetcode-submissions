class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false 
        val countSChars = mutableMapOf<Char, Int>()
        val countTChars = mutableMapOf<Char, Int>()

        for(ch in s) {
            countSChars[ch] = countSChars.getOrDefault(ch, 0) + 1
        }
         for(ch in t) {
            countTChars[ch] = countTChars.getOrDefault(ch, 0) + 1

        }

        return countSChars == countTChars

    }
}
