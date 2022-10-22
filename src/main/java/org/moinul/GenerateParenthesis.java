package org.moinul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParenthesis implements MyRunner {
    @Override
    public void run() {
        System.out.println(Arrays.toString(generateParenthesis(3).toArray()));
    }

    private List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        trackdown(list, "", 0, 0, n);
        return list;
    }

    private void trackdown(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            trackdown(list, str + "(", open + 1, close, max);
        if (close < open)
            trackdown(list, str + ")", open, close + 1, max);
    }
}
