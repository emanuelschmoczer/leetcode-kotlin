package com.schmoczer.leetcode._1342

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class NumberOfStepsToReduceANumberToZeroTest {
    private companion object {
        @JvmStatic
        fun stepsAndNumbers() = listOf(
            Arguments.of(6, 14),
            Arguments.of(4, 8),
            Arguments.of(12, 123),
        )
    }

    private lateinit var sut: NumberOfStepsToReduceANumberToZero

    @BeforeEach
    fun setUp() {
        sut = NumberOfStepsToReduceANumberToZero()
    }

    @ParameterizedTest(name = "{0} steps to reduce number {1}")
    @MethodSource("stepsAndNumbers")
    fun `returns the correct number of steps`(expected: Int, input: Int) {
        val result = sut.numberOfSteps(input)

        assertEquals(expected, result)
    }
}
