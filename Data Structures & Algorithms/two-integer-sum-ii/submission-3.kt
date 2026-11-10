class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var right = numbers.size - 1
        var left = 0
        var movement = 1

        while (left < right) {
            if(numbers[left] + numbers[right] < target) {
                left += movement
            } else if(numbers[left] + numbers[right] > target) {
                right -= movement
            }

            if(numbers[left] + numbers[right] == target) {
                break
            }
        }

        return intArrayOf(left+1, ++right)
    }
}
