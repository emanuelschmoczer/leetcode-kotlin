package com.schmoczer.leetcode._0005

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPalindromicSubstringTest {
    private lateinit var sut: LongestPalindromicSubstring

    @BeforeEach
    fun setUp() {
        sut = LongestPalindromicSubstring()
    }

    @Test
    fun `bab is a palindrom babad`() {
        assertEquals("bab", sut.longestPalindrome("babad"))
    }

    @Test
    fun `bb is a palindrome in cbbd`() {
        assertEquals("bb", sut.longestPalindrome("cbbd"))
    }

    @Test
    fun `a is a palindrome in a`() {
        assertEquals("a", sut.longestPalindrome("a"))
    }

    @Test
    fun `long String containing only the same letter`() {
        val input =
            "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
        assertEquals(input, sut.longestPalindrome(input))
    }
}
