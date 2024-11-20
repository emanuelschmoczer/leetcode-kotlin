package com.schmoczer.leetcode._2516

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class TakeKOfEachCharacterFromLeftAndRightTest {
    private lateinit var sut: TakeKOfEachCharacterFromLeftAndRight

    @BeforeEach
    fun setUp() {
        sut = TakeKOfEachCharacterFromLeftAndRight()
    }

    @Test
    fun `minimum number of minutes for at least 2 characters of aabaaaacaabc is 8`() {
        val input = "aabaaaacaabc"
        val k = 2
        val expected = 8

        val result = sut.takeCharacters(input, k)

        assertEquals(expected, result)
    }

    @Test
    fun `minimum number of minutes for at least 1 characters of a is -1`() {
        val input = "a"
        val k = 1
        val expected = -1

        val result = sut.takeCharacters(input, k)

        assertEquals(expected, result)
    }

    @Test
    fun `minimum number of minutes for at least 1 characters of abc is 3`() {
        val input = "abc"
        val k = 1
        val expected = 3

        val result = sut.takeCharacters(input, k)

        assertEquals(expected, result)
    }

    @Test
    fun `minimum number of minutes for at least 2 characters of caaababcaa is 7`() {
        val input = "caaababcaa"
        val k = 2
        val expected = 7

        val result = sut.takeCharacters(input, k)

        assertEquals(expected, result)
    }
}
