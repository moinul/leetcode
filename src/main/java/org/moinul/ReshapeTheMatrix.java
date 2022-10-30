package org.moinul;

import java.util.Arrays;

public class ReshapeTheMatrix implements MyRunner {
    @Override
    public void run() {
        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        System.out.println("Reshape : " + Arrays.deepToString(reshapeTheMatrix(mat, 2, 4)));
    }

    private int[][] reshapeTheMatrix(int[][] mat, int r, int c) {
        int[][] output = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if ((r * c) != (m * n)) {
            return mat;
        }
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                output[k / c][k % c] = mat[i][j];
                k += 1;
            }
        }

        return output;
    }
}
