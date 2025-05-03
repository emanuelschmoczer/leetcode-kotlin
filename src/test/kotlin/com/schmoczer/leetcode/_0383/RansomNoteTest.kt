package com.schmoczer.leetcode._0383

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class RansomNoteTest {
    private companion object {
        @JvmStatic
        fun notConstructable() = listOf(
            Arguments.of("a", "b"),
            Arguments.of("aa", "ab"),
        )

        @JvmStatic
        fun constructable() = listOf(
            Arguments.of("aa", "aab"),
        )
    }

    private lateinit var sut: RansomNote

    @BeforeEach
    fun setUp() {
        sut = RansomNote()
    }

    @ParameterizedTest(name = "{0} can not be constructed from {1}")
    @MethodSource("notConstructable")
    fun `returns false when ransom note can not be constructed`(note: String, magazine: String) {
        assertFalse(sut.canConstruct(note, magazine))
    }

    @ParameterizedTest(name = "{0} can be constructed from {1}")
    @MethodSource("constructable")
    fun `returns true when ransom note can be constructed`(note: String, magazine: String) {
        assertTrue(sut.canConstruct(note, magazine))
    }
}
