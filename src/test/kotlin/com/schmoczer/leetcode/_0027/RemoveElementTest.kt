package com.schmoczer.leetcode._0027

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class RemoveElementTest {
    private companion object {
        @JvmStatic
        fun numsAndVals() = listOf(
            Arguments.of(intArrayOf(3, 2, 2, 3), 3, 2, intArrayOf(2, 2)),
            Arguments.of(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2, 5, intArrayOf(0, 1, 3, 0, 4)),
        )
    }

    private lateinit var sut: RemoveElement

    @BeforeEach
    fun setUp() {
        sut = RemoveElement()
    }

    @ParameterizedTest(name = "There are {2} elements left after removing {1} from {0}")
    @MethodSource("numsAndVals")
    fun `returns the number of occurences and removes the number`(
        nums: IntArray,
        `val`: Int,
        expectedLength: Int,
        expectedNums: IntArray,
    ) {
        val result = sut.removeElement(nums, `val`)

        assertEquals(expectedLength, result)
        for (i in 0 until expectedLength) {
            assertEquals(expectedNums[i], nums[i])
        }
    }
}
