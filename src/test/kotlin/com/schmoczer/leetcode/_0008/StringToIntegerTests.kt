package com.schmoczer.leetcode._0008

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class StringToIntegerTests {
    private companion object {
        @JvmStatic
        fun stringToIntegerInputs() = listOf(
            Arguments.of("42", 42),
            Arguments.of(" -042", -42),
            Arguments.of("1337c0d3", 1337),
            Arguments.of("0-1", 0),
            Arguments.of("words and 987", 0),
            Arguments.of("-2147483648", Int.MIN_VALUE),
            Arguments.of("2147483647", Int.MAX_VALUE),
            Arguments.of("-91283472332", Int.MIN_VALUE),
            Arguments.of("-2147483649", Int.MIN_VALUE),
            Arguments.of("2147483648", Int.MAX_VALUE),
            Arguments.of("", 0),
            Arguments.of("        ", 0),
        )
    }

    private lateinit var sut: StringToInteger

    @BeforeEach
    fun setUp() {
        sut = StringToInteger()
    }

    @ParameterizedTest(name = "myAtoi(\"{0}\") = {1}")
    @MethodSource("stringToIntegerInputs")
    fun `converts string to integer correctly`(input: String, expected: Int) {
        val result = sut.myAtoi(input)

        assertEquals(expected, result)
    }
}
