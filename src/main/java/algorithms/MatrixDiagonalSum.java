package algorithms;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class MatrixDiagonalSum {
    // Runtime = 0ms, memory = 39.2 MB
    public int diagonalSum(int[][] mat) {
        int sumDiagonal = 0;
        for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
            sumDiagonal += mat[i][i] + ((i != j) ? mat[i][j] : 0);
        }
        return sumDiagonal;
    }
}
