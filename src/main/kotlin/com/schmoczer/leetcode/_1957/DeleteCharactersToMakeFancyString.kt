package com.schmoczer.leetcode._1957

class DeleteCharactersToMakeFancyString {
    fun makeFancyString(s: String): String {
        val fancy = StringBuilder()
        var previous = ' '
        var beforePrevious = ' '
        for (c in s) {
            if (c != beforePrevious || c != previous) {
                fancy.append(c)
            }
            beforePrevious = previous
            previous = c
        }
        return fancy.toString()
    }
}
