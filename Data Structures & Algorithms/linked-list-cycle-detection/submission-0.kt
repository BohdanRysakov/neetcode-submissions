/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var curr = head

        while(curr != null) {
            if(curr.`val` == 2000) {
                return true
            }
            curr.`val` = 2000
            curr = curr.next
        }

        return false
    }
}
