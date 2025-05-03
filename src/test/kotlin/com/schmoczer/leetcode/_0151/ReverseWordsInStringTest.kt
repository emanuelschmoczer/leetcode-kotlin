package com.schmoczer.leetcode._0151

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class ReverseWordsInStringTest {
    private companion object {
        @JvmStatic
        fun reverseWordsInputs() = listOf(
            Arguments.of("the sky is blue", "blue is sky the"),
            Arguments.of("  hello world  ", "world hello"),
            Arguments.of("a good   example", "example good a"),
        )
    }

    private lateinit var sut: ReverseWordsInString

    @BeforeEach
    fun setUp() {
        sut = ReverseWordsInString()
    }

    @ParameterizedTest(name = "reverse words in \"{0}\" results in \"{1}\"")
    @MethodSource("reverseWordsInputs")
    fun `reverses words in a string`(input: String, expected: String) {
        val result = sut.reverseWords(input)

        assertEquals(expected, result)
    }
}
