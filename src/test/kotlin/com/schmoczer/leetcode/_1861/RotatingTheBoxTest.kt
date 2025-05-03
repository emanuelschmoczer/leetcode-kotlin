package com.schmoczer.leetcode._1861

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class RotatingTheBoxTest {
    private companion object {
        @JvmStatic
        fun boxInputs() = listOf(
            Arguments.of(
                arrayOf(charArrayOf('#', '.', '#')),
                arrayOf(
                    charArrayOf('.'),
                    charArrayOf('#'),
                    charArrayOf('#'),
                ),
            ),
            Arguments.of(
                arrayOf(
                    charArrayOf('#', '.', '*', '.'),
                    charArrayOf('#', '#', '*', '.'),
                ),
                arrayOf(
                    charArrayOf('#', '.'),
                    charArrayOf('#', '#'),
                    charArrayOf('*', '*'),
                    charArrayOf('.', '.'),
                ),
            ),
            Arguments.of(
                arrayOf(
                    charArrayOf('#', '#', '*', '.', '*', '.'),
                    charArrayOf('#', '#', '#', '*', '.', '.'),
                    charArrayOf('#', '#', '#', '.', '#', '.'),
                ),
                arrayOf(
                    charArrayOf('.', '#', '#'),
                    charArrayOf('.', '#', '#'),
                    charArrayOf('#', '#', '*'),
                    charArrayOf('#', '*', '.'),
                    charArrayOf('#', '.', '*'),
                    charArrayOf('#', '.', '.'),
                ),
            ),
        )
    }

    private lateinit var sut: RotatingTheBox

    @BeforeEach
    fun setUp() {
        sut = RotatingTheBox()
    }

    @ParameterizedTest(name = "rotated box for input {0} is {1}")
    @MethodSource("boxInputs")
    fun `returns the correct rotated box`(input: Array<CharArray>, expected: Array<CharArray>) {
        val result = sut.rotateTheBox(input)

        for (i in expected.indices) {
            assertContentEquals(expected[i], result[i])
        }
    }
}
