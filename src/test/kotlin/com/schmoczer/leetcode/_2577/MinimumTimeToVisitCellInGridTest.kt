package com.schmoczer.leetcode._2577

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumTimeToVisitCellInGridTest {
    private lateinit var sut: MinimumTimeToVisitCellInGrid

    @BeforeEach
    fun setUp() {
        sut = MinimumTimeToVisitCellInGrid()
    }

    @Test
    fun `a 0,1,3,2 | 5,1,2,5 | 4,3,8,6 grid needs a minimum time of 7`() {
        val grid = arrayOf(
            intArrayOf(0, 1, 3, 2),
            intArrayOf(5, 1, 2, 5),
            intArrayOf(4, 3, 8, 6),
        )
        val expected = 7

        val result = sut.minimumTime(grid)

        assertEquals(expected, result)
    }

    @Test
    fun `a 0,2,4 | 3,2,1 | 1,0,4 grid has no path`() {
        val grid = arrayOf(
            intArrayOf(0, 2, 4),
            intArrayOf(3, 2, 1),
            intArrayOf(1, 0, 4),
        )
        val expected = -1

        val result = sut.minimumTime(grid)

        assertEquals(expected, result)
    }
}
