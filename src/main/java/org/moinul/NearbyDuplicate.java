package org.moinul;

public class NearbyDuplicate implements MyRunner {
    @Override
    public void run() {

        System.out.println("Has Near by duplicate : " + containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        //System.out.println("Has Near by duplicate : " + containsNearbyDuplicate(new int[]{1, 0,1,1}, 1));
        //System.out.println("Has Near by duplicate : " + containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean d = false;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int n = Math.min(len, (i + k + 1));
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] == nums[j])) {
                    d = true;
                    break;
                }
            }
            if (d) break;
        }
        return d;
    }
}

