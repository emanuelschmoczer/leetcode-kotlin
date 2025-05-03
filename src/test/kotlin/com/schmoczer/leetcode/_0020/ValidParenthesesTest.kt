package com.schmoczer.leetcode._0020

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class ValidParenthesesTest {
    private companion object {
        @JvmStatic
        fun parenthesesInputs() = listOf(
            Arguments.of("()", true),
            Arguments.of("()[]{}", true),
            Arguments.of("(]", false),
            Arguments.of("([])", true),
            Arguments.of("(", false),
            Arguments.of(")", false),
        )
    }

    private lateinit var sut: ValidParentheses

    @BeforeEach
    fun setUp() {
        sut = ValidParentheses()
    }

    @ParameterizedTest(name = "isValid(\"{0}\") = {1}")
    @MethodSource("parenthesesInputs")
    fun `validates parentheses correctly`(input: String, expected: Boolean) {
        val result = sut.isValid(input)

        assertEquals(expected, result)
    }
}
