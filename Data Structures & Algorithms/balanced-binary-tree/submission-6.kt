/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
   fun isBalanced(root: TreeNode?): Boolean {
        return checkHeight(root) != -1
    }

    private fun checkHeight(node: TreeNode?): Int {
        if (node == null) return 0

        val leftH = checkHeight(node.left)
        if (leftH == -1) return -1 

        val rightH = checkHeight(node.right)
        if (rightH == -1) return -1

        if (abs(leftH - rightH) > 1) {
            return -1 
        }

        return max(leftH, rightH) + 1
    }
}
