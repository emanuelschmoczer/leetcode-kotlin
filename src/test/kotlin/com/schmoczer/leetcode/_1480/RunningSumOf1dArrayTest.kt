package com.schmoczer.leetcode._1480

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class RunningSumOf1dArrayTest {
    private companion object {
        @JvmStatic
        fun runningSumInputs() = listOf(
            Arguments.of(intArrayOf(1, 2, 3, 4), intArrayOf(1, 3, 6, 10)),
            Arguments.of(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 2, 3, 4, 5)),
            Arguments.of(intArrayOf(3, 1, 2, 10, 1), intArrayOf(3, 4, 6, 16, 17)),
        )
    }

    private lateinit var sut: RunningSumOf1dArray

    @BeforeEach
    fun setUp() {
        sut = RunningSumOf1dArray()
    }

    @ParameterizedTest(name = "running sum of {0} is {1}")
    @MethodSource("runningSumInputs")
    fun `returns the correct running sum`(input: IntArray, expected: IntArray) {
        val result = sut.runningSum(input)

        assertContentEquals(expected, result)
    }
}
