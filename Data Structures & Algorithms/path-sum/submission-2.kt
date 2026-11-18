/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if(root == null) return false 

        // leaf
        if(root.left == null && root.right == null)  {
            return if(root.`val` == targetSum) true else false
        }

        root.left?.let { 
            it.`val` += root.`val`
        }
        root.right?.let { 
            it.`val` += root.`val`
        }

        if(hasPathSum(root.left, targetSum)) {
            return true
        }
        if(hasPathSum(root.right, targetSum)) {
            return true
        }

        return false
    }
}