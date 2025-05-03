package com.schmoczer.leetcode._1957

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class DeleteCharactersToMakeFancyStringTest {
    private companion object {
        @JvmStatic
        fun fancyStringInputs() = listOf(
            Arguments.of("leeetcode", "leetcode"),
            Arguments.of("aaabaaaa", "aabaa"),
            Arguments.of("aab", "aab"),
        )
    }

    private lateinit var sut: DeleteCharactersToMakeFancyString

    @BeforeEach
    fun setUp() {
        sut = DeleteCharactersToMakeFancyString()
    }

    @ParameterizedTest(name = "fancy string for input \"{0}\" is \"{1}\"")
    @MethodSource("fancyStringInputs")
    fun `returns the correct fancy string`(input: String, expected: String) {
        val result = sut.makeFancyString(input)

        assertEquals(expected, result)
    }
}
