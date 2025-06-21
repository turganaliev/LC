package binarysearch.sqrtx_69;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int l = 0;
        int r = x;

        while (l <= r) {
            int sqrtx = l + ((r - l) / 2);

            if ((long) sqrtx * sqrtx == (long) x) {
                return sqrtx;
            } else if ((long) sqrtx * sqrtx > (long) x) {
                r = sqrtx - 1;
            } else {
                l = sqrtx + 1;
            }
        }
        return r;
    }
}
