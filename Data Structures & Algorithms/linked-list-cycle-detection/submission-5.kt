/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {

        var curr: ListNode? = head
        var head1 = head?.next
        var i = 0
        while(head1 != null && head1?.next != null ){
            if(curr == head1) {
                return true
            }
            head1 = head1?.next
            if(i % 2 == 0 ) {
                curr = curr?.next
            }
            i++
        }

        return false

    }
}
