package com.schmoczer.leetcode._1861

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RotatingTheBoxTest {
    private lateinit var sut: RotatingTheBox

    @BeforeEach
    fun setUp() {
        sut = RotatingTheBox()
    }

    @Test
    fun `matrix with 1 row rotated`() {
        val input = arrayOf(charArrayOf('#', '.', '#'))
        val expected = arrayOf(
            charArrayOf('.'),
            charArrayOf('#'),
            charArrayOf('#'),
        )

        val result = sut.rotateTheBox(input)

        for (i in 0 until expected.size) {
            assertContentEquals(expected[i], result[i])
        }
    }

    @Test
    fun `matrix with 2 rows rotated`() {
        val input = arrayOf(
            charArrayOf('#', '.', '*', '.'),
            charArrayOf('#', '#', '*', '.'),
        )
        val expected = arrayOf(
            charArrayOf('#', '.'),
            charArrayOf('#', '#'),
            charArrayOf('*', '*'),
            charArrayOf('.', '.'),
        )

        val result = sut.rotateTheBox(input)

        for (i in 0 until expected.size) {
            assertContentEquals(expected[i], result[i])
        }
    }

    @Test
    fun `matrix with 3 rows rotated`() {
        val input = arrayOf(
            charArrayOf('#', '#', '*', '.', '*', '.'),
            charArrayOf('#', '#', '#', '*', '.', '.'),
            charArrayOf('#', '#', '#', '.', '#', '.'),
        )
        val expected = arrayOf(
            charArrayOf('.', '#', '#'),
            charArrayOf('.', '#', '#'),
            charArrayOf('#', '#', '*'),
            charArrayOf('#', '*', '.'),
            charArrayOf('#', '.', '*'),
            charArrayOf('#', '.', '.'),
        )

        val result = sut.rotateTheBox(input)

        for (i in 0 until expected.size) {
            assertContentEquals(expected[i], result[i])
        }
    }
}
