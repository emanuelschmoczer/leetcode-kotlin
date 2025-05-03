package com.schmoczer.leetcode._2914

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MinChangesTest {
    private companion object {
        @JvmStatic
        fun changesInputs() = listOf(
            Arguments.of("1001", 2),
            Arguments.of("10", 1),
            Arguments.of("0000", 0),
        )
    }

    private lateinit var sut: MinChanges

    @BeforeEach
    fun setUp() {
        sut = MinChanges()
    }

    @ParameterizedTest(name = "minimum changes for input \"{0}\" is {1}")
    @MethodSource("changesInputs")
    fun `returns the correct minimum changes`(input: String, expected: Int) {
        val result = sut.minChanges(input)

        assertEquals(expected, result)
    }
}
