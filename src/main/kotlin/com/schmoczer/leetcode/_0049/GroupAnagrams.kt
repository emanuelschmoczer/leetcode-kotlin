package com.schmoczer.leetcode._0049

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var anagrams = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val sorted = str.toCharArray().sorted().toString()
            val list = anagrams[sorted]
            if (list == null) {
                anagrams[sorted] = mutableListOf(str)
            } else {
                list.add(str)
            }
        }
        return anagrams.values.toList()
    }
}
