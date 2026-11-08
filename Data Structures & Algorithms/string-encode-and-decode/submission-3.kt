class Solution {
    fun encode(inputStrings: List<String>): String {
        if(inputStrings.isEmpty()) {
            return ""
        }

        val encoded = buildString {
            for (string in inputStrings) {
                val delimiter = string.length.toString() + DELIMITER_SYMBOL
                append(delimiter + string)
            }
        }
        return encoded
    }

    fun decode(str: String): List<String> {
        if(str == "") {
            return emptyList()
        }

        val decodedList = mutableListOf<String>()

        var lengthOfString = ""

        var i = 0
        while(i < str.length) {
            var sizeOfString: Int? = null

            if (str[i].isDigit()) {
                lengthOfString += str[i]
            }

            if (str[i] == DELIMITER_SYMBOL) {
                sizeOfString = lengthOfString.toInt()
            }

            if (sizeOfString != null) {
                if(sizeOfString != 0) {
                    decodedList.add(str.substring(i + 1, i + sizeOfString + 1))
                }else {
                    decodedList.add("")
                }
                lengthOfString = ""

                i += sizeOfString+1
            } else {
                i ++;
            }
        }

        return decodedList
    }

    companion object {
        private const val DELIMITER_SYMBOL = '!'
    }
}
