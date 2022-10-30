package org.moinul;

public class FirstUniqueCharacterInString implements MyRunner {
    @Override
    public void run() {
        String input = "leetcode";
        System.out.println("First Unique Character: " + firstUniqueCharacter(input));
    }

    private int firstUniqueCharacter(String s) {
        int fucIndex = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int indx = s.indexOf(c);
            if ((indx != -1) && (indx == s.lastIndexOf(c))) {
                fucIndex = Math.min(indx, fucIndex);
            }
        }

        return (fucIndex == Integer.MAX_VALUE) ? -1 : fucIndex;
    }
}
