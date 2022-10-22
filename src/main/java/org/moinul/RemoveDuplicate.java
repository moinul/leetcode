package org.moinul;

public class RemoveDuplicate implements MyRunner {
    @Override
    public void run() {
        //System.out.println("Array Length After Removing Duplicate : " + removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        //System.out.println("Array Length After Removing Duplicate : " + removeDuplicates(new int[]{1, 1, 2}));
         System.out.println("Array Length After Removing Duplicate : " + removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        //[0,1,1,2,3] ----> [0,1,2,3,4]
    }

    private int removeDuplicates(int[] nums) {
        int k = 0;
        int l = nums.length;
        for (int i = 1; i < (l - k); i++) {
            if (nums[i-1] == nums[i]) {
                for (int j = i; j < (l - k); j++) {
                    nums[j - 1] = nums[j];
                }
                i -= 1;
                k += 1;
            }
        }
        return (l - k);
    }
}
