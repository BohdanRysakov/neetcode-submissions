class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0 
        var right = heights.size-1 
        var maxValue = 0;

        while (left < right) {
            val value = (right-left) * min(heights[left], heights[right])
            maxValue = max(maxValue, value) 

            if(heights[left] < heights[right]) {
                left++
            } else right--
        }


        return maxValue
    }
}
