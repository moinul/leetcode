package org.moinul;

import java.util.Arrays;

public class TwoSum implements MyRunner {
    @Override
    public void run() {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 3}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        boolean hasMatch = false;
        int[] indices = null;
        for (int i = 0; i < nums.length; i++) {
            indices = new int[2];
            indices[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    indices[1] = j;
                    hasMatch = true;
                    break;
                }
            }
            if (hasMatch) break;
        }
        return indices;
    }
}
