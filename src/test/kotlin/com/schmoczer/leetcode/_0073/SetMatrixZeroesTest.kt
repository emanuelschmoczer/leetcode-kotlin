package com.schmoczer.leetcode._0073

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class SetMatrixZeroesTest {
    private lateinit var sut: SetMatrixZeroes

    @BeforeEach
    fun setUp() {
        sut = SetMatrixZeroes()
    }

    @Test
    fun `set zeroes on 3x3 matrix`() {
        val input = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
        val expected = arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, 0, 0), intArrayOf(1, 0, 1))

        sut.setZeroes(input)

        for (i in 0 until expected.size) {
            assertContentEquals(expected[i], input[i])
        }
    }

    @Test
    fun `set zeroes on 3x4 matrix`() {
        val input = arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5))
        val expected = arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 4, 5, 0), intArrayOf(0, 3, 1, 0))

        sut.setZeroes(input)

        for (i in 0 until expected.size) {
            assertContentEquals(expected[i], input[i])
        }
    }
}
