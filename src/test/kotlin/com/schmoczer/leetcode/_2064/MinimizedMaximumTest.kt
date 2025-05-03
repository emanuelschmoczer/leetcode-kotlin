package com.schmoczer.leetcode._2064

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MinimizedMaximumTest {
    private companion object {
        @JvmStatic
        fun testInputs() = listOf(
            Arguments.of(6, intArrayOf(11, 6), 3),
            Arguments.of(7, intArrayOf(15, 10, 10), 5),
            Arguments.of(1, intArrayOf(100000), 100000),
        )
    }

    private lateinit var sut: MinimizedMaximum

    @BeforeEach
    fun setUp() {
        sut = MinimizedMaximum()
    }

    @ParameterizedTest(name = "minimized maximum for {0} stores and products {1} is {2}")
    @MethodSource("testInputs")
    fun `returns the correct minimized maximum`(numberOfStores: Int, quantities: IntArray, expected: Int) {
        val result = sut.minimizedMaximum(numberOfStores, quantities)

        assertEquals(expected, result)
    }
}
