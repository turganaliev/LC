package twopointers.mergesortedarray_88;

class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int indexP1 = m - 1;
        int indexP2 = n - 1;
        int indexLast = m + n - 1;

        while (indexP2 >= 0) {
            if (indexP1 >= 0 && nums1[indexP1] >= nums2[indexP2]) {
                nums1[indexLast--] = nums1[indexP1--];
            } else {
                nums1[indexLast--] = nums2[indexP2--];
            }
        }
        return nums1;
    }
}
