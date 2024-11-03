package com.schmoczer.leetcode._0796

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RotateStringTest {
    private lateinit var sut: RotateString

    @BeforeEach
    fun setUp() {
        sut = RotateString()
    }

    @Test
    fun `abcde can be rotated into cdeab`() {
        assertTrue(sut.rotateString("abcde", "cdeab"))
    }

    @Test
    fun `abcde can not be rotated into abced`() {
        assertFalse(sut.rotateString("abcde", "abced"))
    }
}
