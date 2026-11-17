/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null) return true

        val current =  abs(traverse(root.right,1) - traverse(root.left,1)) <= 1

        return current && isBalanced(root.right) && isBalanced(root.left)
    }

    fun traverse(root: TreeNode?, currentHeight: Int) : Int {
        if(root==null) return currentHeight
        var leftH = currentHeight + 1
        var rightH = currentHeight + 1
        if(root.left != null) leftH = traverse(root.left, leftH)
        if(root.right != null) rightH = traverse(root.right, rightH)

        return max(leftH, rightH)
    }
}
