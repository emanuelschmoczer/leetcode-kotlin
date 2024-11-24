package com.schmoczer.leetcode._2257

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class CountUnguardedCellsInTheGridTest {
    private lateinit var sut: CountUnguardedCellsInTheGrid

    @BeforeEach
    fun setUp() {
        sut = CountUnguardedCellsInTheGrid()
    }

    @Test
    fun `7 unguarded cells in a 4x6 grid`() {
        val m = 4
        val n = 6
        val guards = arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(2, 3))
        val walls = arrayOf(intArrayOf(0, 1), intArrayOf(2, 2), intArrayOf(1, 4))
        val expected = 7

        val result = sut.countUnguarded(m, n, guards, walls)

        assertEquals(expected, result)
    }

    @Test
    fun `4 unguarded cells in a 3x3 grid`() {
        val m = 3
        val n = 3
        val guards = arrayOf(intArrayOf(1, 1))
        val walls = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(2, 1), intArrayOf(1, 2))
        val expected = 4

        val result = sut.countUnguarded(m, n, guards, walls)

        assertEquals(expected, result)
    }
}
