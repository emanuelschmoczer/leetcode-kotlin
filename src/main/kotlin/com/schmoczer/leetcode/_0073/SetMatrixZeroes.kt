package com.schmoczer.leetcode._0073

class SetMatrixZeroes {
    fun setZeroes(matrix: Array<IntArray>) {
        val foundZeroes = mutableListOf<Pair<Int, Int>>()
        for (i in 0 until matrix.size) {
            for (j in 0 until matrix.first().size) {
                if (matrix[i][j] == 0) {
                    foundZeroes.add(Pair(i, j))
                }
            }
        }
        for (foundZero in foundZeroes) {
            for (i in 0 until matrix.first().size) {
                matrix[foundZero.first][i] = 0
            }
            for (i in 0 until matrix.size) {
                matrix[i][foundZero.second] = 0
            }
        }
    }
}
