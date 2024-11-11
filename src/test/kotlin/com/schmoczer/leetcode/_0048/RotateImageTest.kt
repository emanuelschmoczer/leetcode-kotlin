package com.schmoczer.leetcode._0048

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RotateImageTest {
    private lateinit var sut: RotateImage

    @BeforeEach
    fun setUp() {
        sut = RotateImage()
    }

    @Test
    fun `rotate 3x3 matrix`() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val expected = arrayOf(intArrayOf(7, 4, 1), intArrayOf(8, 5, 2), intArrayOf(9, 6, 3))

        sut.rotate(input)

        for (i in 0 until expected.size) {
            assertContentEquals(expected[i], input[i])
        }
    }

    @Test
    fun `rotate 4x4 matrix`() {
        val input = arrayOf(intArrayOf(5, 1, 9, 11), intArrayOf(2, 4, 8, 10), intArrayOf(13, 3, 6, 7), intArrayOf(15, 14, 12, 16))
        val expected = arrayOf(intArrayOf(15, 13, 2, 5), intArrayOf(14, 3, 4, 1), intArrayOf(12, 6, 8, 9), intArrayOf(16, 7, 10, 11))

        sut.rotate(input)

        for (i in 0 until expected.size) {
            assertContentEquals(expected[i], input[i])
        }
    }
}
