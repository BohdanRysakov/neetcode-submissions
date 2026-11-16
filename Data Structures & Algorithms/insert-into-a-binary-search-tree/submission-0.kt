/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        val value = `val`
        val nodeValue = root?.`val`


        if(root == null) {
            return TreeNode(value)
        }

        if(nodeValue!! < value) {
            root.right = insertIntoBST(root.right, value)
        } else if(nodeValue > value) {
             root.left = insertIntoBST(root.left, value)
        }

        return root
    }
}
