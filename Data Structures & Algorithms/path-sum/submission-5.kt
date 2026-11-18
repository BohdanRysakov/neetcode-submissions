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
            return targetSum -root.`val` == 0
        }

        return hasPathSum(root.left, targetSum  - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
}