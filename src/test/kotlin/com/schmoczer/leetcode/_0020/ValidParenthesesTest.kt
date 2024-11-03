package com.schmoczer.leetcode._0020

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidParenthesesTest {
    private lateinit var sut: ValidParentheses

    @BeforeEach
    fun setUp() {
        sut = ValidParentheses()
    }

    @Test
    fun `() is valid`() {
        assertTrue(sut.isValid("()"))
    }

    @Test
    fun `all 3 brackets opening and closing after each other is valid`() {
        assertTrue(sut.isValid("()[]{}"))
    }

    @Test
    fun `closing bracket different from opening bracket is not valid`() {
        assertFalse(sut.isValid("(]"))
    }

    @Test
    fun `square brackets inside round brackets is valid`() {
        assertTrue(sut.isValid("([])"))
    }

    @Test
    fun `only 1 opening bracket is not valid`() {
        assertFalse(sut.isValid("("))
    }

    @Test
    fun `only closing bracket is not valid`() {
        assertFalse(sut.isValid(")"))
    }
}
