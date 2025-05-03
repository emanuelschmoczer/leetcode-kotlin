package com.schmoczer.leetcode._0186

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class ReverseWordsInStringInPlaceTest {
    private companion object {
        @JvmStatic
        fun reverseWordsInputs() = listOf(
            Arguments.of(
                charArrayOf('t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'),
                charArrayOf('b', 'l', 'u', 'e', ' ', 'i', 's', ' ', 's', 'k', 'y', ' ', 't', 'h', 'e'),
            ),
            Arguments.of(
                charArrayOf('a'),
                charArrayOf('a'),
            ),
        )
    }

    private lateinit var sut: ReverseWordsInStringInPlace

    @BeforeEach
    fun setUp() {
        sut = ReverseWordsInStringInPlace()
    }

    @ParameterizedTest(name = "reverse words in \"{0}\" results in \"{1}\"")
    @MethodSource("reverseWordsInputs")
    fun `reverses words in place`(input: CharArray, expected: CharArray) {
        sut.reverseWords(input)

        assertContentEquals(expected, input)
    }
}
