/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()

        val result = mutableListOf<Int>()
        val deq = ArrayDeque<TreeNode>()
        deq.add(root)

        while(deq.isNotEmpty()) {
            var first: Int? = null

            for(i in 0 until deq.size) {
                val node = deq.removeFirst()

                if(first == null) first = node.`val`

                node.right?.let{deq.add(node.right)}
                node.left?.let{deq.add(node.left)}

            }
            first?.let{result.add(it)}
        }

        return result
    }
}
