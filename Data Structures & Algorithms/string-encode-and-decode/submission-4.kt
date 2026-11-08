class Solution {
        fun encode(inputStrings: List<String>): String {
            if (inputStrings.isEmpty()) return ""

            return buildString {
                for (string in inputStrings) {
                    // Цепочка append вместо конкатенации через '+'
                    append(string.length).append(DELIMITER_SYMBOL).append(string)
                }
            }
        }

        fun decode(str: String): List<String> {
            if (str.isEmpty()) return emptyList()

            val decodedList = mutableListOf<String>()
            var i = 0

            while (i < str.length) {
                // Находим индекс следующего разделителя, начиная с текущей позиции i
                val delimiterIndex = str.indexOf(DELIMITER_SYMBOL, i)

                // Вытаскиваем размер строки (всё от i до разделителя)
                val size = str.substring(i, delimiterIndex).toInt()

                // Вычисляем границы самой строки
                val start = delimiterIndex + 1
                val end = start + size

                decodedList.add(str.substring(start, end))

                // Прыгаем на начало следующего блока
                i = end
            }

            return decodedList
        }

        private val DELIMITER_SYMBOL = '!'
    }