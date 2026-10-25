/*
Definition for a Node.
class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}
*/

class Solution {
   fun cloneGraph(node: Node?, visitedNodes : MutableMap<Int, Node> = mutableMapOf()): Node? {
       val safeNode = node ?: return null

       val newNode = Node(node.`val`) 

       if(visitedNodes.containsKey(newNode.`val`)) {
        return visitedNodes[newNode.`val`]
       }

       visitedNodes.put(safeNode.`val`, newNode)

       val newNeighbors = arrayListOf<Node?>()

      for (neighbor in safeNode.neighbors) {
            newNeighbors.add(cloneGraph(neighbor, visitedNodes))
        }

       newNode.neighbors = newNeighbors
       return newNode
    }
}
