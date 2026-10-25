/*
Definition for a Node.
class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}
*/

class Solution {
   fun cloneGraph(node: Node?, visited: MutableMap<Int, Node> = mutableMapOf()): Node? {
        val safeNode = node ?: return null
        
        if (visited.containsKey(safeNode.`val`)) {
            return visited[safeNode.`val`]
        }
        val cloneNode = Node(safeNode.`val`)
        
        visited[safeNode.`val`] = cloneNode
        val newNeighbors = ArrayList<Node?>()
        
        for (neighbor in safeNode.neighbors) {
            newNeighbors.add(cloneGraph(neighbor, visited))
        }
        
        cloneNode.neighbors = newNeighbors
        
        return cloneNode
    }
}
