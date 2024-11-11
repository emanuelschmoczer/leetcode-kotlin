package com.schmoczer.leetcode._0054

class SpiralMatrix {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var leftBoundary = -1
        var upperBoundary = 0
        var rightBoundary = matrix.first().size
        var lowerBoundary = matrix.size
        val result = mutableListOf<Int>()

        fun moveLeft(row: Int, column: Int): Pair<Int, Int> {
            for (i in (leftBoundary + 1 until column + 1).reversed()) {
                result.add(matrix[row][i])
            }
            leftBoundary++
            return Pair(row, leftBoundary)
        }

        fun moveUp(row: Int, column: Int): Pair<Int, Int> {
            for (i in (upperBoundary + 1 until row + 1).reversed()) {
                result.add(matrix[i][column])
            }
            upperBoundary++
            return Pair(upperBoundary, column)
        }

        fun moveRight(row: Int, column: Int): Pair<Int, Int> {
            for (i in column until rightBoundary) {
                result.add(matrix[row][i])
            }
            rightBoundary--
            return Pair(row, rightBoundary)
        }

        fun moveDown(row: Int, column: Int): Pair<Int, Int> {
            for (i in row until lowerBoundary) {
                result.add(matrix[i][column])
            }
            lowerBoundary--
            return Pair(lowerBoundary, column)
        }

        var row = 0
        var column = 0
        while (true) {
            val afterRight = moveRight(row, column)
            if (leftBoundary >= rightBoundary || upperBoundary >= lowerBoundary) break
            val afterDown = moveDown(afterRight.first + 1, afterRight.second)
            if (leftBoundary >= rightBoundary || upperBoundary >= lowerBoundary) break
            val afterLeft = moveLeft(afterDown.first, afterDown.second - 1)
            if (leftBoundary >= rightBoundary || upperBoundary >= lowerBoundary) break
            val afterUp = moveUp(afterLeft.first - 1, afterLeft.second)
            if (leftBoundary >= rightBoundary || upperBoundary >= lowerBoundary) break
            row = afterUp.first
            column = afterUp.second + 1
        }
        return result
    }
}
