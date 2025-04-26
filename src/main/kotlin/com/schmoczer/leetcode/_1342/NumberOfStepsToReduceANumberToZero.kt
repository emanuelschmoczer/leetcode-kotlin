package com.schmoczer.leetcode._1342

class NumberOfStepsToReduceANumberToZero {
    fun numberOfSteps(num: Int): Int {
        var reduced = num
        var steps = 0
        while (reduced > 0) {
            steps++
            if (reduced % 2 == 0) {
                reduced = reduced / 2
            } else {
                reduced -= 1
            }
        }
        return steps
    }
}
