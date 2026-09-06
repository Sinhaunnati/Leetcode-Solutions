class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int up = matrix[i - 1][j];
                if (j > 0) {
                    up = Math.min(up, matrix[i - 1][j - 1]);
                }
                if (j < n - 1) {
                    up = Math.min(up, matrix[i - 1][j + 1]);
                }
                matrix[i][j] += up;
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            minSum = Math.min(minSum, matrix[n - 1][j]);
        }
        return minSum;
    }
}