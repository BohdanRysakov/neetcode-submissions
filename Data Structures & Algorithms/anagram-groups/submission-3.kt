class Solution {
   fun groupAnagrams(strs: Array<String>): List<List<String>> {
   return strs.groupBy { 
            // Это лямбда, которая генерирует ключ для группировки
            it.toCharArray().sorted().joinToString("") 
        }.values.toList()
}
}
