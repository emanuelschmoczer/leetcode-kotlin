package com.schmoczer.leetcode._2257

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class CountUnguardedCellsInTheGridTest {
    private companion object {
        @JvmStatic
        fun gridInputs() = listOf(
            Arguments.of(
                4,
                6,
                arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(2, 3)),
                arrayOf(intArrayOf(0, 1), intArrayOf(2, 2), intArrayOf(1, 4)),
                7,
            ),
            Arguments.of(
                3,
                3,
                arrayOf(intArrayOf(1, 1)),
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(2, 1), intArrayOf(1, 2)),
                4,
            ),
        )
    }

    private lateinit var sut: CountUnguardedCellsInTheGrid

    @BeforeEach
    fun setUp() {
        sut = CountUnguardedCellsInTheGrid()
    }

    @ParameterizedTest(name = "unguarded cells for grid {0}x{1} with guards {2} and walls {3} is {4}")
    @MethodSource("gridInputs")
    fun `returns the correct number of unguarded cells`(
        rows: Int,
        cols: Int,
        guards: Array<IntArray>,
        walls: Array<IntArray>,
        expected: Int,
    ) {
        val result = sut.countUnguarded(rows, cols, guards, walls)

        assertEquals(expected, result)
    }
}
