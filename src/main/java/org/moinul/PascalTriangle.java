package org.moinul;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle implements MyRunner {
    @Override
    public void run() {
        System.out.println("Pascale's Triangle : " + generate(5).toString());
    }

    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> row, pRow = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pRow.get(j - 1) + pRow.get(j));
                }
            pRow = row;
            output.add(row);
        }
        return output;
    }
}
