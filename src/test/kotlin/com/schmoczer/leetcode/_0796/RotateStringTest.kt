package com.schmoczer.leetcode._0796

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RotateStringTest {
    private lateinit var rs: RotateString

    @BeforeEach
    fun setUp() {
        rs = RotateString()
    }

    @Test
    fun `abcde can be rotated into cdeab`() {
        assertTrue(rs.rotateString("abcde", "cdeab"))
    }

    @Test
    fun `abcde can not be rotated into abced`() {
        assertFalse(rs.rotateString("abcde", "abced"))
    }
}
