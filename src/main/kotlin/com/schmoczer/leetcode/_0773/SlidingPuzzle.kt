package com.schmoczer.leetcode._0773

class SlidingPuzzle {
    private companion object {
        val directions = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(0, 2, 4),
            intArrayOf(1, 5),
            intArrayOf(0, 4),
            intArrayOf(1, 3, 5),
            intArrayOf(2, 4),
        )
    }

    fun slidingPuzzle(board: Array<IntArray>): Int {
        val startState = StringBuilder()
        for (row in board) {
            for (tile in row) {
                startState.append(tile)
            }
        }
        val visited = HashMap<String, Int>()
        dfs(startState.toString(), visited, startState.indexOf("0"), 0)
        return visited["123450"] ?: -1
    }

    private fun dfs(
        state: String,
        visited: MutableMap<String, Int>,
        zeroPos: Int,
        moves: Int,
    ) {
        if (visited[state] != null && visited[state]!! <= moves) {
            return
        }
        visited[state] = moves

        for (nextPos in directions[zeroPos]) {
            val newState = swap(state, zeroPos, nextPos)
            dfs(newState, visited, nextPos, moves + 1)
        }
    }

    private fun swap(str: String, i: Int, j: Int): String {
        val swapped = StringBuilder(str)
        swapped.setCharAt(i, str[j])
        swapped.setCharAt(j, str[i])
        return swapped.toString()
    }
}
