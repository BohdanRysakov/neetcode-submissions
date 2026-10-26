class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
     val frequencyMap = nums.asIterable().groupingBy { it }.eachCount().toList().sortedByDescending { (_, v) -> v }

    return frequencyMap.take(k).map { it.first }.toIntArray()
   }
}
