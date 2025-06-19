package twopointers.reversestring_344;

class Solution {
    public char[] reverseString(char[] s) {
        int right = s.length - 1;
        int left = 0;

        while (right > left) {
            char temp = s[right];
            s[right--] = s[left];
            s[left++] = temp;
        }
        return s;
    }
}
