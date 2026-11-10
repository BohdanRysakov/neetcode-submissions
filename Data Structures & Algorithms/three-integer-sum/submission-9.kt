class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort() 

        for (i in 0 until nums.size) {
            val toLookFor = nums[i]
            var left = i+1

           if (i > 0 && nums[i] == nums[i - 1]) continue
            var right = nums.size-1 

            while(left < right) {

                if(nums[left] + nums[right] > -toLookFor) {
                    right--
                }
                else if(nums[left] + nums[right] < -toLookFor) {
                    left++
                } else {
                    result.add(listOf(nums[left], nums[right],toLookFor))
                    right--;
                    left++;

                    while (left < right && nums[left] == nums[left - 1]) {
    left++
}
while (left < right && nums[right] == nums[right + 1]) {
    right--
}
                }
            }
        }

        return result
    }
}
