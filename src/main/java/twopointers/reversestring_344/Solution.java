package twopointers.reversestring_344;

class Solution {
    public char[] reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
        return s;
    }
}
