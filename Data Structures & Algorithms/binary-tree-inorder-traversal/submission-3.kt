/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        if(root == null) return emptyList()
            result.addAll(inorderTraversal(root.left))
            result.add(root.`val`)
            result.addAll(inorderTraversal(root.right))
        return result
    }
}
