package com.schmoczer.leetcode._2516

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class TakeKOfEachCharacterFromLeftAndRightTest {
    private companion object {
        @JvmStatic
        fun inputProvider() = listOf(
            Arguments.of("aabaaaacaabc", 2, 8),
            Arguments.of("a", 1, -1),
            Arguments.of("abc", 1, 3),
            Arguments.of("caaababcaa", 2, 7),
        )
    }

    private lateinit var sut: TakeKOfEachCharacterFromLeftAndRight

    @BeforeEach
    fun setUp() {
        sut = TakeKOfEachCharacterFromLeftAndRight()
    }

    @ParameterizedTest(name = "minimum number of minutes for input \"{0}\" with k = {1} is {2}")
    @MethodSource("inputProvider")
    fun `returns the correct minimum number of minutes`(input: String, k: Int, expected: Int) {
        val result = sut.takeCharacters(input, k)

        assertEquals(expected, result)
    }
}
