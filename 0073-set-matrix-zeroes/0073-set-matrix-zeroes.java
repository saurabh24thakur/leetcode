class Solution {
    public void setZeroes(int[][] matrix) {
        setMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == Integer.MIN_VALUE + 7) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    set(arr, i, j);
                }
            }
        }
    }

    public void set(int[][] arr, int i, int j) {
        for (int m = 0; m < arr[0].length; m++) {
            if (arr[i][m] != 0) {
                arr[i][m] = Integer.MIN_VALUE + 7;
            }
        }

        for (int m = 0; m < arr.length; m++) {
            if (arr[m][j] != 0) {
                arr[m][j] = Integer.MIN_VALUE + 7;
            }
        }
    }
}