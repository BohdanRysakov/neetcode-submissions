/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num: Int): Int
 */

class Solution : GuessGame() {
    fun guessNumber(n: Int): Int {

        var left = 1
        var right = n

        var pointer = left + (right-left)/2
        var guessResult = guess(pointer)
        
        while(guessResult != 0) {
            if(guessResult == -1) {
                right = pointer
                pointer = left + (right-left -1 )/2
            }
            else if(guessResult == 1) {
                left = pointer
                pointer = left + (right-left + 1)/2
            }

            guessResult = guess(pointer)
        }

        return pointer

    }
}
