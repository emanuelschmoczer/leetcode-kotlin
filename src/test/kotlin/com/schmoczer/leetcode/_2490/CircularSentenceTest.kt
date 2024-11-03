package com.schmoczer.leetcode._2490

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CircularSentenceTest {
    private lateinit var sut: CircularSentence

    @BeforeEach
    fun setUp() {
        sut = CircularSentence()
    }

    @Test
    fun `leetcode exercises sound delightful is a circular sentence`() {
        assertTrue(sut.isCircularSentence("leetcode exercises sound delightful"))
    }

    @Test
    fun `eetcode is a circular sentence`() {
        assertTrue(sut.isCircularSentence("eetcode"))
    }

    @Test
    fun `Leetcode is cool is not a circular sentence`() {
        assertFalse(sut.isCircularSentence("Leetcode is cool"))
    }
}
