package com.schmoczer.leetcode._1295

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class FindNumbersWithEvenNumberOfDigitsTest {
    private companion object {
        @JvmStatic
        fun nums() = listOf(
            Arguments.of(intArrayOf(12, 345, 2, 6, 7896), 2),
            Arguments.of(intArrayOf(555, 901, 482, 1771), 1),
        )
    }

    private lateinit var sut: FindNumbersWithEvenNumberOfDigits

    @BeforeEach
    fun setUp() {
        sut = FindNumbersWithEvenNumberOfDigits()
    }

    @ParameterizedTest(name = "{0} has {1} items with a even number of digits")
    @MethodSource("nums")
    fun `returns the count of evenly numbered digits`(input: IntArray, expected: Int) {
        val result = sut.findNumbers(input)

        assertEquals(expected, result)
    }
}
