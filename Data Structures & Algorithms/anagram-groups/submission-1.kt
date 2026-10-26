class Solution {
   fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val buckets = mutableMapOf<String, MutableList<String>>()
    for (s in strs) {
        val chars = s.toCharArray()
            chars.sort()
            val key = String(chars)
        if ((buckets.containsKey(key))) {
            buckets.getOrDefault(key, mutableListOf()).add(s)
        } else {
            buckets[key] = mutableListOf(s)
        }
    }

    return buckets.values.toList()
}
}
