class Solution {
   fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val buckets = mutableMapOf<String, MutableList<String>>()
    for (s in strs) {
        val chars = s.toCharArray()
        chars.sort()
        val key = String(chars)
        
        buckets.getOrPut(key) { mutableListOf() }.add(s)
    }

    return buckets.values.toList()
}
}
