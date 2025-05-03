package com.schmoczer.leetcode._2275

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class LargestCombinationTest {
    private companion object {
        @JvmStatic
        fun combinationInputs() = listOf(
            Arguments.of(intArrayOf(16, 17, 71, 62, 12, 24, 14), 4),
            Arguments.of(intArrayOf(8, 8), 2),
            Arguments.of(intArrayOf(1, 2, 4, 8), 1),
        )
    }

    private lateinit var sut: LargestCombination

    @BeforeEach
    fun setUp() {
        sut = LargestCombination()
    }

    @ParameterizedTest(name = "largest combination for input {0} is {1}")
    @MethodSource("combinationInputs")
    fun `returns the correct largest combination`(input: IntArray, expected: Int) {
        val result = sut.largestCombination(input)

        assertEquals(expected, result)
    }
}
