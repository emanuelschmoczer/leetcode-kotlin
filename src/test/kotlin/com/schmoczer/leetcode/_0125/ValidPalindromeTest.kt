package com.schmoczer.leetcode._0125

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidPalindromeTest {
    private lateinit var sut: ValidPalindrome

    @BeforeEach
    fun setUp() {
        sut = ValidPalindrome()
    }

    @Test
    fun `amanaplanacanalpanama is a palindrome`() {
        assertTrue(sut.isPalindrome("A man, a plan, a canal: Panama"))
    }

    @Test
    fun `"raceacar" is not a palindrome`() {
        assertFalse(sut.isPalindrome("race a car"))
    }

    @Test
    fun `blank String is a palindrome`() {
        assertTrue(sut.isPalindrome(" "))
    }

    @Test
    fun `0P is not a palindrome`() {
        assertFalse(sut.isPalindrome("0P"))
    }

    @Test
    fun `only punctuation is a palindrome`() {
        assertTrue(sut.isPalindrome(".,"))
    }
}
