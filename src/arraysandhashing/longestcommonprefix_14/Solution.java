package arraysandhashing.longestcommonprefix_14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 0; i < prefix.length(); i++) {
            for (String str : strs) {
                if (i >= str.length() || prefix.charAt(i) != str.charAt(i)) {
                    return prefix.substring(0, i);
                }
            }
        } return prefix;
    }
}
