package com.schmoczer.leetcode._1346

class CheckIfNAndItsDoubleExist {
    // Approach 1: Bruteforce
    // Runtime 2ms Beats 98.33%
    fun checkIfExist1(arr: IntArray): Boolean {
        for (i in 0 until arr.size) {
            val firstNumber = arr[i]
            for (j in i + 1 until arr.size) {
                val secondNumber = arr[j]
                if (firstNumber * 2 == secondNumber || firstNumber == 2 * secondNumber) {
                    return true
                }
            }
        }
        return false
    }

    // Approach 2: Set lookup
    // Runtime 2ms Beats 98.33%
    fun checkIfExist(arr: IntArray): Boolean {
        val seen = mutableSetOf<Int>()
        for (index in 0 until arr.size) {
            val number = arr[index]
            if (seen.contains(number) || seen.contains(number shl 1 shl 1)) {
                return true
            }
            seen.add(number shl 1)
        }
        return false
    }
}
