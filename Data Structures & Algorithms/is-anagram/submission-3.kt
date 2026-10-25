class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false 
        val charCounts = mutableMapOf<Char, Int>()

        for(i in s.indices) {
            charCounts[s[i]] = charCounts.getOrDefault(s[i], 0) + 1
            charCounts[t[i]] = charCounts.getOrDefault(t[i], 0) - 1
        }

        return charCounts.values.all { it == 0 }
    }
}
