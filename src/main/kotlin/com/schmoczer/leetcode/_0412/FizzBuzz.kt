package com.schmoczer.leetcode._0412

class FizzBuzz {
    // Runtime 1ms Beats 100.00%
    fun fizzBuzz(n: Int): List<String> {
        val answer = mutableListOf<String>()
        for (index in 1..n) {
            answer.add(
                when {
                    index % 3 == 0 && index % 5 == 0 -> "FizzBuzz"
                    index % 3 == 0 -> "Fizz"
                    index % 5 == 0 -> "Buzz"
                    else -> "$index"
                },
            )
        }
        return answer
    }
}
