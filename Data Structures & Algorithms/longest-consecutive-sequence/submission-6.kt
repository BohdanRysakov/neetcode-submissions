class Solution {
fun longestConsecutive(nums: IntArray): Int {

        if(nums.isEmpty()) return 0

        val numsPresence = nums.toHashSet()

        // #1
        var maxLengthFound = 1        

        for(n in numsPresence) {
            if(maxLengthFound > (numsPresence.size/2)) break
            if(!numsPresence.contains(n-1)) { 
                // N is start of sequence 
                var currentNumber = n+1
                var currentMax = 1
                while(numsPresence.contains(currentNumber)) {
                        currentNumber++
                        currentMax++
                                          }
                
                 maxLengthFound = maxOf(currentMax,maxLengthFound)
            }
        }

        return maxLengthFound
    }
}