class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        return nums.asIterable().groupingBy{n -> n}
        .eachCount().toList().sortedByDescending{(k,v) -> v}
        .take(k).map{it.first}.toIntArray()
    }
}