package com.schmoczer.leetcode._2914

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class MinChangesTest {
    private lateinit var sut: MinChanges

    @BeforeEach
    fun setUp() {
        sut = MinChanges()
    }

    @Test
    fun `1001 needs 2 changes`() {
        assertEquals(2, sut.minChanges("1001"))
    }

    @Test
    fun `10 nees 1 change`() {
        assertEquals(1, sut.minChanges("10"))
    }

    @Test
    fun `0000 needs 0 changes`() {
        assertEquals(0, sut.minChanges("0000"))
    }
}
