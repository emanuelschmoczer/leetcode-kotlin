package com.schmoczer.leetcode._0141

class LinkedListCycle {
    // Approach 1
    fun hasCycle1(head: ListNode?): Boolean {
        val visitedNodes = mutableSetOf<ListNode>()
        var current = head
        while (current?.next != null) {
            if (visitedNodes.add(current).not()) {
                return true
            }
            current = current.next
        }
        return false
    }

    // Approach 2: slow and fast pointer
    fun hasCycle(head: ListNode?): Boolean {
        if (head?.next == null) {
            return false
        }
        var slow: ListNode? = head
        var fast: ListNode? = slow?.next
        while (fast?.next != null) {
            fast = fast.next?.next
            if (fast === slow) {
                return true
            }
            slow = slow?.next
        }
        return false
    }
}

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
