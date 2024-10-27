package com.schmoczer.leetcode._0125

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidPalindromeTest {
    @Test
    fun `amanaplanacanalpanama is a palindrome`() {
        assertTrue(ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"))
    }

    @Test
    fun `"raceacar" is not a palindrome`() {
        assertFalse(ValidPalindrome().isPalindrome("race a car"))
    }

    @Test
    fun `blank String is a palindrome`() {
        assertTrue(ValidPalindrome().isPalindrome(" "))
    }

    @Test
    fun `0P is not a palindrome`() {
        assertFalse(ValidPalindrome().isPalindrome("0P"))
    }

    @Test
    fun `only punctuation is a palindrome`() {
        assertTrue(ValidPalindrome().isPalindrome(".,"))
    }
}
