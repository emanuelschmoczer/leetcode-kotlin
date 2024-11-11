package com.schmoczer.leetcode._0054

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class SpiralMatrixTest {
    private lateinit var sut: SpiralMatrix

    @BeforeEach
    fun setUp() {
        sut = SpiralMatrix()
    }

    @Test
    fun `spiral a 3x3 matrix`() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val exptected = listOf(1, 2, 3, 6, 9, 8, 7, 4, 5)

        assertEquals(exptected, sut.spiralOrder(input))
    }

    @Test
    fun `spiral a 4x4 matrix`() {
        val input = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
        val expected = listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)

        assertEquals(expected, sut.spiralOrder(input))
    }
}
