package com.schmoczer.leetcode._2577

import java.util.*

class MinimumTimeToVisitCellInGrid {
    // Runtime 142ms Beats 100.00%
    fun minimumTime(grid: Array<IntArray>): Int {
        if (grid[0][1] > 1 && grid[1][0] > 1) {
            return -1
        }

        val lastRow = grid.size - 1
        val lastColumn = grid.first().size - 1
        val directions = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
        val queue = PriorityQueue<IntArray>(compareBy { it[2] })
        queue.offer(intArrayOf(0, 0, 0))
        while (queue.isNotEmpty()) {
            val (currentRow, currentColumn, currentTime) = queue.poll()
            if (currentRow == lastRow && currentColumn == lastColumn) {
                return currentTime
            }
            grid[currentRow][currentColumn] = -1
            for (i in 0 until 4) {
                val nextRow = currentRow + directions[i][0]
                val nextColumn = currentColumn + directions[i][1]
                if (nextRow in 0..lastRow && nextColumn in 0..lastColumn && grid[nextRow][nextColumn] > -1) {
                    val difference = grid[nextRow][nextColumn] - currentTime
                    val nextTime = currentTime + if (difference < 2) {
                        1
                    } else if (difference % 2 == 0) {
                        difference + 1
                    } else {
                        difference
                    }
                    queue.offer(intArrayOf(nextRow, nextColumn, nextTime))
                    grid[nextRow][nextColumn] = -1
                }
            }
        }
        return -1
    }
}
