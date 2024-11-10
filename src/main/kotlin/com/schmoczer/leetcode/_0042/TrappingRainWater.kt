package com.schmoczer.leetcode._0042

import kotlin.math.max
import kotlin.math.min

class TrappingRainWater {
    // Approach 1: bruteforce
    fun trap1(height: IntArray): Int {
        if (height.size < 3) {
            return 0
        }
        var water = 0
        var leftHeight = height.first()
        var rightHeight = height.copyOfRange(2, height.size).max()
        for (i in 1 until height.size - 1) {
            val currentHeight = height[i]
            height[i - 1].let {
                if (it > leftHeight) {
                    leftHeight = it
                }
            }
            if (currentHeight == rightHeight) {
                rightHeight = height.copyOfRange(i + 1, height.size).max()
            }
            val lowest = min(leftHeight, rightHeight)
            if (lowest > currentHeight) {
                water += lowest - currentHeight
            }
        }
        return water
    }

    // Approach 2: 2 pointers, Runtime 1ms Beats 100.00%
    fun trap(height: IntArray): Int {
        if (height.size < 3) {
            return 0
        }
        var water = 0
        var leftIndex = 0
        var rightIndex = height.size - 1
        var leftHeight = 0
        var rightHeight = 0
        while (leftIndex < rightIndex) {
            if (height[leftIndex] < height[rightIndex]) {
                leftHeight = max(leftHeight, height[leftIndex])
                water += leftHeight - height[leftIndex]
                leftIndex++
            } else {
                rightHeight = max(rightHeight, height[rightIndex])
                water += rightHeight - height[rightIndex]
                rightIndex--
            }
        }
        return water
    }
}
