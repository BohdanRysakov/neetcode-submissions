class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()
        nums.sort() 

        for (i in 0 until nums.size) {
            val toLookFor = nums[i]
            var left = i+1
            var right = nums.size-1 

            while(left < right) {

                if(nums[left] + nums[right] > -toLookFor) {
                    right--
                }
                else if(nums[left] + nums[right] < -toLookFor) {
                    left++
                } else {
                    result.add(listOf(nums[left], nums[right],toLookFor).sorted())
                    right--;
                }
            }
        }

        return result.toList()
    }
}
