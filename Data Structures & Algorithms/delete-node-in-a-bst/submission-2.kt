/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if(root == null) return null
        var ancor: TreeNode? = root

        if(ancor!!.`val` > key) {
            if(ancor.left == null) return root
                ancor.left = deleteNode(ancor.left!!, key)
            } 
        else if(ancor.`val` < key) {
                 if(ancor.right == null) return root
                ancor.right = deleteNode(ancor.right!!, key)
            }
        else {
        
        // leaf
        if(ancor != null && ancor.left == null && ancor.right == null) {
            return null
        } else {
            if(ancor!!.right != null) {
                val minRight = findMin(ancor.right)!!.`val`!!
                ancor.right = deleteNode(ancor.right, minRight)

                ancor.`val` = minRight
            } else if(ancor!!.left != null) {
                val maxLeft = findMax(ancor.left)
                ancor.left = deleteNode(ancor.left, maxLeft!!.`val`)

                ancor.`val` = maxLeft.`val`
            }
        }
        }

        return ancor
    }

    fun findMin(root: TreeNode?) : TreeNode? {
        var x = root
        while(x !=null && x.left != null) {
            x = x.left
        }

        return x
    }

     fun findMax(root: TreeNode?) : TreeNode? {
        var root = root
        while(root !=null && root.right != null) {
            root = root.right
        }

        return root
    }
}
    


