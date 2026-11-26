class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()

        for(i in 0 until nums.size) {
            val toLookFor = nums[i]
            var left = i+1
            var right = nums.size-1

            if (i > 0 && nums[i] == nums[i - 1]) continue

            while(left < right) {
                val sum = nums[left] + nums[right]
                if(sum == -toLookFor) {
                    result.add(listOf(nums[left],nums[right],toLookFor))
                    left++
                    right--
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--
                    }
                } else if(sum > -toLookFor) {
                    right--
                } else {
                    left++
                }
            }
        }

        return result
    }
}
