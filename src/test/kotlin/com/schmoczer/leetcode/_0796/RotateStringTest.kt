package com.schmoczer.leetcode._0796

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class RotateStringTest {
    private companion object {
        @JvmStatic
        fun rotateStringInputs() = listOf(
            Arguments.of("abcde", "cdeab", true),
            Arguments.of("abcde", "abced", false),
            Arguments.of("aa", "aa", true),
            Arguments.of("abc", "cab", true),
            Arguments.of("abc", "acb", false),
        )
    }

    private lateinit var sut: RotateString

    @BeforeEach
    fun setUp() {
        sut = RotateString()
    }

    @ParameterizedTest(name = "rotateString(\"{0}\", \"{1}\") = {2}")
    @MethodSource("rotateStringInputs")
    fun `validates if one string can be rotated into another`(s: String, goal: String, expected: Boolean) {
        val result = sut.rotateString(s, goal)

        assertEquals(expected, result)
    }
}
