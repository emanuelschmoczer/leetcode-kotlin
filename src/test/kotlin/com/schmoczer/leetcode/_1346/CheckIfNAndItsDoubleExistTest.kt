package com.schmoczer.leetcode._1346

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class CheckIfNAndItsDoubleExistTest {
    private companion object {
        @JvmStatic
        fun integerArrays() = listOf(
            Arguments.of(intArrayOf(10, 2, 5, 3), true),
            Arguments.of(intArrayOf(3, 1, 7, 11), false),
            Arguments.of(intArrayOf(-10, 12, -20, -8, 15), true),
        )
    }

    private lateinit var sut: CheckIfNAndItsDoubleExist

    @BeforeEach
    fun setUp() {
        sut = CheckIfNAndItsDoubleExist()
    }

    @ParameterizedTest(name = "{0} has an element that is the double of another element: {1}")
    @MethodSource("integerArrays")
    fun `returns true if a double exist`(input: IntArray, expected: Boolean) {
        val result = sut.checkIfExist(input)

        assertEquals(expected, result)
    }
}
