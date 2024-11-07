package com.schmoczer.leetcode._2275

class LargestCombination {
    fun largestCombination(candidates: IntArray): Int {
        val doubleOfMaxCandidate = candidates.max() * 2
        var largestCombination = 0
        var bit = 1
        while (bit < doubleOfMaxCandidate) {
            var counter = 0
            for (value in candidates) {
                if (value and bit > 0) {
                    counter++
                }
            }
            if (counter > largestCombination) {
                largestCombination = counter
            }
            bit *= 2
        }
        return largestCombination
    }
}
