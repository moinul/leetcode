package org.moinul;

public class MedianOfSortedArray implements MyRunner {
    @Override
    public void run() {
        System.out.println("Median :" + findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int j = 0;
        int k = 0;
        double m;
        int[] nums12 = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums12.length; i++) {
            if (nums1[j] < nums2[k]) {
                nums12[i] = nums1[j];
                j += nums1.length > j + 1 ? 1 : 0;
            } else {
                nums12[i] = nums2[k];
                k += nums2.length > k + 1 ? 1 : 0;
            }
        }
        int l = nums12.length / 2;
        if (nums12.length % 2 == 0) {
            m = (nums12[l] + nums12[l + 1]) / 2;
        } else {
            m = nums12[l + 1] / 2;
        }
        return m;
    }
}
