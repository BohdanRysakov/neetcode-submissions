class Solution {
fun longestConsecutive(nums: IntArray): Int {

        if(nums.isEmpty()) return 0

        val numsPresence = nums.toHashSet()

        // #1
        var maxLengthFound = 1        

        for(n in nums) {
            if(maxLengthFound>(nums.size/2)) break
            if(!numsPresence.contains(n-1)) { 
                // N is start of sequence 
                var currentNumber = n+1
                var currentMax = 1
                while(true) {
                    if(numsPresence.contains(currentNumber)) {
                        currentNumber++
                        currentMax++
                    } else {
                        maxLengthFound = Math.max(currentMax,maxLengthFound)
                        break;
                    }
                }
            }
        }

        return maxLengthFound
    }
}