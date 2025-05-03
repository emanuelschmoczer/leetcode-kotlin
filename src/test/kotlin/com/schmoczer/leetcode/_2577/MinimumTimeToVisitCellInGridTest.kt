package com.schmoczer.leetcode._2577

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MinimumTimeToVisitCellInGridTest {
    private companion object {
        @JvmStatic
        fun gridInputs() = listOf(
            Arguments.of(
                arrayOf(
                    intArrayOf(0, 1, 3, 2),
                    intArrayOf(5, 1, 2, 5),
                    intArrayOf(4, 3, 8, 6),
                ),
                7,
            ),
            Arguments.of(
                arrayOf(
                    intArrayOf(0, 2, 4),
                    intArrayOf(3, 2, 1),
                    intArrayOf(1, 0, 4),
                ),
                -1,
            ),
        )
    }

    private lateinit var sut: MinimumTimeToVisitCellInGrid

    @BeforeEach
    fun setUp() {
        sut = MinimumTimeToVisitCellInGrid()
    }

    @ParameterizedTest(name = "minimum time for grid {0} is {1}")
    @MethodSource("gridInputs")
    fun `returns the correct minimum time`(grid: Array<IntArray>, expected: Int) {
        val result = sut.minimumTime(grid)

        assertEquals(expected, result)
    }
}
