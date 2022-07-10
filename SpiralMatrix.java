//This function takes an m x n matrix and returns all elements of the matrix in spiral order.
    
    ArrayList spiralMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList spiralList = new ArrayList<>();

        for (int i = 0; i < m * n + 1; ++i) {
            for (int j = 0 + i; j < m - i; ++j)
                spiralList.add(matrix[i][j]);

            for (int j = 1 + i; j < n - i; ++j)
                spiralList.add(matrix[j][m - 1 - i]);

            for (int j = m - 2 - i; j >= 0 + i; --j)
                spiralList.add(matrix[n - 1 - i][j]);

            for (int j = n - 2 - i; j >= 1 + i; --j)
                spiralList.add(matrix[j][i]);

            }
            return spiralList;
        }
