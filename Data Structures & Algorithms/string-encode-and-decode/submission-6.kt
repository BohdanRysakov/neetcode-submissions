class Solution {
        fun encode(inputStrings: List<String>): String {
            if (inputStrings.isEmpty()) return ""

            return buildString {
                for (string in inputStrings) {
                    append(string.length).append(DELIMITER_SYMBOL).append(string)
                }
            }
        }

        fun decode(str: String): List<String> {
            if (str.isEmpty()) return emptyList()

            val decodedList = mutableListOf<String>()
            var i = 0

            while (i < str.length) {
                val delimiterIndex = str.indexOf(DELIMITER_SYMBOL, i)

                val size = str.substring(i, delimiterIndex).toInt()

                val start = delimiterIndex + 1
                val end = start + size

                decodedList.add(str.substring(start, end))

                i = end
            }

            return decodedList
        }

        private val DELIMITER_SYMBOL = '!'
    }