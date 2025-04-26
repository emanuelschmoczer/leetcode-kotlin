package com.schmoczer.leetcode._1342

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test

class NumberOfStepsToReduceANumberToZeroTest {
    private lateinit var sut: NumberOfStepsToReduceANumberToZero

    @BeforeEach
    fun setUp() {
        sut = NumberOfStepsToReduceANumberToZero()
    }

    @Test
    fun `6 steps to reduce number 14`() {
        val input = 14
        val expected = 6

        val result = sut.numberOfSteps(input)

        assertEquals(expected, result)
    }

    @Test
    fun `4 steps to reduce number 8`() {
        val input = 8
        val expected = 4

        val result = sut.numberOfSteps(input)

        assertEquals(expected, result)
    }

    @Test
    fun `12 steps to reduce number 123`() {
        val input = 123
        val expected = 12

        val result = sut.numberOfSteps(input)

        assertEquals(expected, result)
    }
}
