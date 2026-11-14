/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        
    var prev: ListNode? = null
    var curr: ListNode? = head
    
    while (curr != null) {
        val nextTemp = curr.next // Save next node
        curr.next = prev         // Reverse pointer
        prev = curr              // Advance prev
        curr = nextTemp          // Advance curr
    }

    return prev

    }

}