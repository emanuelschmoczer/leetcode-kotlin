package com.schmoczer.leetcode._2257

import com.schmoczer.leetcode._2257.CountUnguardedCellsInTheGrid.Companion.GUARD
import com.schmoczer.leetcode._2257.CountUnguardedCellsInTheGrid.Companion.GUARDED
import com.schmoczer.leetcode._2257.CountUnguardedCellsInTheGrid.Companion.WALL

class CountUnguardedCellsInTheGrid {
    internal companion object {
        const val UNGUARDED = 0
        const val GUARDED = 1
        const val GUARD = 2
        const val WALL = 3
    }

    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        var grid = Array<IntArray>(m) { IntArray(n) { UNGUARDED } }
        for (guard in guards) {
            grid[guard.first()][guard.last()] = GUARD
        }
        for (wall in walls) {
            grid[wall.first()][wall.last()] = WALL
        }
        for (i in 0 until m) {
            var isGuardActive = grid[i][0] == GUARD
            for (j in 1 until n) {
                isGuardActive = grid.update(i, j, isGuardActive)
            }
            isGuardActive = grid[i][n - 1] == GUARD
            for (j in n - 2 downTo 0) {
                isGuardActive = grid.update(i, j, isGuardActive)
            }
        }
        for (j in 0 until n) {
            var isGuardActive = grid[0][j] == GUARD
            for (i in 1 until m) {
                isGuardActive = grid.update(i, j, isGuardActive)
            }
            isGuardActive = grid[m - 1][j] == GUARD
            for (i in m - 2 downTo 0) {
                isGuardActive = grid.update(i, j, isGuardActive)
            }
        }
        return grid.sumOf { it.count { it == UNGUARDED } }
    }
}

private fun Array<IntArray>.update(i: Int, j: Int, isGuardActive: Boolean): Boolean {
    if (this[i][j] == GUARD) {
        return true
    }
    if (this[i][j] == WALL) {
        return false
    }
    if (isGuardActive) {
        this[i][j] = GUARDED
    }
    return isGuardActive
}
