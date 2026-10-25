class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numToAppear = mutableMapOf<Int, Int>()

        nums.forEach { n ->
            numToAppear.getOrPut(n) { 0 }
                .also { curVal ->
                    if(curVal > 0) return true
                    numToAppear[n] = curVal.inc()
                }
        }
        return false
    }
}
