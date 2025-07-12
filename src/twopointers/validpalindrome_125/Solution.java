package twopointers.validpalindrome_125;

class Solution {
    public boolean isPalindrome(String s) {
        String processed_s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = processed_s.length() - 1;

        while (left < right) {
            if (processed_s.charAt(left) != processed_s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
