package org.moinul;

import java.util.Arrays;

public class ValidAnagram implements MyRunner {
    @Override
    public void run() {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("My Anagram :" + isAnagram(s, t));
    }

    private boolean isAnagram(String s, String t) {
        boolean isValid = true;
        if (s.length() == t.length()) {
            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();
            Arrays.sort(sArr);
            Arrays.sort(tArr);
            for (int i = 0; i < sArr.length; i++) {
                if (sArr[i] != tArr[i]) {
                    isValid = false;
                    break;
                }
            }
        } else {
            isValid = false;
        }
        return isValid;
    }
}
