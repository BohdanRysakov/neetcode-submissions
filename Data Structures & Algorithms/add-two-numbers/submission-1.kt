/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var leftPointer: ListNode? = l1 
        var rightPointer: ListNode? = l2 

        var start = ListNode(0)
        var dummy = ListNode(0)
        dummy.next = start

        var addition = 0

        while (leftPointer != null && rightPointer != null) {
            var sum = leftPointer.`val` + rightPointer.`val` + addition
            addition = 0
            if(sum >= 10){
                addition = sum / 10
                sum -=10
            }
            start.next = ListNode(sum)
            start = start.next!!

            leftPointer = leftPointer.next
            rightPointer = rightPointer.next
        }
       
        if(leftPointer == null && rightPointer == null){
                if(addition > 0){
                    start.next = ListNode(addition)
                }
        }

        var leftOverList = leftPointer ?: rightPointer

        while(leftOverList != null) {
            var sum = leftOverList.`val` + addition
            addition = 0
            if(sum >= 10){
                addition = sum / 10
                sum -=10
            }
            start.next = ListNode(sum)
            start = start.next!!
            leftOverList = leftOverList.next
        }

        if(addition > 0) start.next = ListNode(addition)
            
        return dummy.next!!.next
    }
}
