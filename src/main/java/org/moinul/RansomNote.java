package org.moinul;

public class RansomNote implements MyRunner {
    @Override
    public void run() {
        String ransomNote = "aabb";
        String magazine = "abcd";
        System.out.println("Is Ransome Note: " + canConstruct(ransomNote, magazine));
    }

    private boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            int val = ch - 'a';
            if (count[val] <= 0) return false;
            count[val]--;
        }
        return true;
    }
}
