package com.schmoczer.leetcode._0042

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class TrappingRainWaterTests {
    private lateinit var sut: TrappingRainWater

    @BeforeEach
    fun setUp() {
        sut = TrappingRainWater()
    }

    @Test
    fun `0,1,0,2,1,0,1,3,2,1,2,1 traps 6 water`() {
        val input = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)

        assertEquals(6, sut.trap(input))
    }

    @Test
    fun `4,2,0,3,2,5 traps 9 water`() {
        val input = intArrayOf(4, 2, 0, 3, 2, 5)

        assertEquals(9, sut.trap(input))
    }
}
