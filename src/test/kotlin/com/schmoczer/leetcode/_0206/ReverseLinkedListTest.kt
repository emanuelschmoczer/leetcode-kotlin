package com.schmoczer.leetcode._0206

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ReverseLinkedListTest {
    private lateinit var sut: ReverseLinkedList

    @BeforeEach
    fun setUp() {
        sut = ReverseLinkedList()
    }

    @Test
    fun `list with 5 items`() {
        var li = ListNode(5)
        for (i in (1..4).reversed()) {
            val temp = ListNode(i)
            temp.next = li
            li = temp
        }

        val reversed = sut.reverseList(li)

        assertEquals(5, reversed?.`val`)
        assertEquals(4, reversed?.next?.`val`)
        assertEquals(3, reversed?.next?.next?.`val`)
        assertEquals(2, reversed?.next?.next?.next?.`val`)
        assertEquals(1, reversed?.next?.next?.next?.next?.`val`)
    }

    @Test
    fun `list with 2 items`() {
        val li = ListNode(1)
        li.next = ListNode(2)

        val reversed = sut.reverseList(li)

        assertEquals(2, reversed?.`val`)
        assertEquals(1, reversed?.next?.`val`)
    }

    @Test
    fun `empty list`() {
        val reversed = sut.reverseList(null)

        assertNull(reversed)
    }
}
