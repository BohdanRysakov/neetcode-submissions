class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val squareSide = 3

        var i = 0 
        var k = 0

        var criteriaOne = mutableSetOf<Char>()
        var criteriaTwo = mutableSetOf<Char>()
        var criteriaThree = Array<MutableSet<Char>>(board.size) {mutableSetOf<Char>()} 
        // cell number - Array

        for(i in 0 until board.size) {
            for(k in 0 until board.size) {
                val cellNumber = (i/3)*3 + k/3
                val currentCharForOne = board[i][k]
                val currentCharForTwo = board[k][i]
                if(currentCharForOne!='.') {
                    if(!criteriaOne.add(currentCharForOne)) {
                        return false
                    }

                     if(!criteriaThree[cellNumber].add(currentCharForOne)) {
                        return false
                    }
                }

                if(currentCharForTwo!='.') {
                    if(!criteriaTwo.add(currentCharForTwo)) {
                        return false
                    }
                }
            }

            criteriaOne = mutableSetOf<Char>()
            criteriaTwo = mutableSetOf<Char>()
        }

        for(i in 0 until board.size) {
            
        }

        return true 
    }
}
