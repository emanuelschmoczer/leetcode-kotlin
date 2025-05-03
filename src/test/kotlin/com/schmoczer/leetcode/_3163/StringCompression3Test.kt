package com.schmoczer.leetcode._3163

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class StringCompression3Test {
    private companion object {
        @JvmStatic
        fun compressionInputs() = listOf(
            Arguments.of("abcde", "1a1b1c1d1e"),
            Arguments.of("aaaaaaaaaaaaaabb", "9a5a2b"),
            Arguments.of("aabbcc", "2a2b2c"),
        )
    }

    private lateinit var sut: StringCompression3

    @BeforeEach
    fun setUp() {
        sut = StringCompression3()
    }

    @ParameterizedTest(name = "compressed string for input \"{0}\" is \"{1}\"")
    @MethodSource("compressionInputs")
    fun `returns the correct compressed string`(input: String, expected: String) {
        val result = sut.compressedString(input)

        assertEquals(expected, result)
    }
}
