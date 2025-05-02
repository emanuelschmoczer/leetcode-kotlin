package com.schmoczer.leetcode._0383

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test

class RansomNoteTest {
    private lateinit var sut: RansomNote

    @BeforeEach
    fun setUp() {
        sut = RansomNote()
    }

    @Test
    fun `a can not be constructed from b`() {
        val note = "a"
        val magazine = "b"

        assertFalse(sut.canConstruct(note, magazine))
    }

    @Test
    fun `aa can not be constructed from ab`() {
        val note = "aa"
        val magazine = "ab"

        assertFalse(sut.canConstruct(note, magazine))
    }

    @Test
    fun `aa can be constructed from aab`() {
        val note = "aa"
        val magazine = "aab"

        assertTrue(sut.canConstruct(note, magazine))
    }
}
