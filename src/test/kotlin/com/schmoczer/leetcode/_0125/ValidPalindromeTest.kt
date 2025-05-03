package com.schmoczer.leetcode._0125

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class ValidPalindromeTest {
    private companion object {
        @JvmStatic
        fun palindromeInputs() = listOf(
            Arguments.of("A man, a plan, a canal: Panama", true),
            Arguments.of("race a car", false),
            Arguments.of(" ", true),
            Arguments.of("0P", false),
            Arguments.of(".,", true),
        )
    }

    private lateinit var sut: ValidPalindrome

    @BeforeEach
    fun setUp() {
        sut = ValidPalindrome()
    }

    @ParameterizedTest(name = "\"{0}\" is a palindrome: {1}")
    @MethodSource("palindromeInputs")
    fun `validates if a string is a palindrome`(input: String, expected: Boolean) {
        val result = sut.isPalindrome(input)

        assertEquals(expected, result)
    }
}
