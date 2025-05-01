package com.schmoczer.leetcode._0876

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test

class MiddleOfTheLinkedListTest {
    private lateinit var sut: MiddleOfTheLinkedList

    @BeforeEach
    fun setUp() {
        sut = MiddleOfTheLinkedList()
    }

    @Test
    fun `middle of 1,2,3,4,5 is 3`() {
        val input = createLinkedList(1, 2, 3, 4, 5)
        val expected = 3

        val result = sut.middleNode(input)

        assertEquals(expected, result?.`val`)
    }

    @Test
    fun `middle of 1,2,3,4,5,6 is 4`() {
        val input = createLinkedList(1, 2, 3, 4, 5, 6)
        val expected = 4

        val result = sut.middleNode(input)

        assertEquals(expected, result?.`val`)
    }

    private fun createLinkedList(vararg list: Int): ListNode {
        var node = ListNode(list.last())
        for (i in (0..<(list.size - 1)).reversed()) {
            node = ListNode(list[i], node)
        }
        return node
    }
}
