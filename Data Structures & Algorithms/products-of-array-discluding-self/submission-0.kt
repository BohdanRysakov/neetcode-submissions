class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val prefix = IntArray(n) { 1 }
        val result = IntArray(n) { 1 }
        for (i in 1 until n) {
            prefix[i] = prefix[i - 1] * nums[i - 1]
        }

        val suffix = IntArray(n) { 1 }
        for (i in n - 2 downTo 0) {
            suffix[i] = suffix[i + 1] * nums[i + 1]
        }

        for(i in 0 until nums.size)  {
            result[i] = prefix[i]*suffix[i]
        }

        return result
    }

    fun findProduct(nums: IntArray, start: Int, end: Int): Int  {
        var result = 1

        for (i in start until end) {
            result *= nums[i]
        }

        return result
    }
}
