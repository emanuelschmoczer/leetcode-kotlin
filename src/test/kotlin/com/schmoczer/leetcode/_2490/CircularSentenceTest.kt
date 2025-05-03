package com.schmoczer.leetcode._2490

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class CircularSentenceTest {
    private companion object {
        @JvmStatic
        fun sentenceInputs() = listOf(
            Arguments.of("leetcode exercises sound delightful", true),
            Arguments.of("eetcode", true),
            Arguments.of("Leetcode is cool", false),
        )
    }

    private lateinit var sut: CircularSentence

    @BeforeEach
    fun setUp() {
        sut = CircularSentence()
    }

    @ParameterizedTest(name = "\"{0}\" is a circular sentence: {1}")
    @MethodSource("sentenceInputs")
    fun `validates if a sentence is circular`(sentence: String, expected: Boolean) {
        val result = sut.isCircularSentence(sentence)

        assertEquals(expected, result)
    }
}
