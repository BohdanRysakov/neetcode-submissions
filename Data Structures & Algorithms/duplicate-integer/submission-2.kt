class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>();
        for(i in nums) {
            if(!seen.add(i)) return true
        }
        return false;
    }
}
