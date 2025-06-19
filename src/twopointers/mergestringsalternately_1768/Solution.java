package twopointers.mergestringsalternately_1768;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(); int k = word2.length();

        StringBuilder res = new StringBuilder();

        int i = 0; int j = 0;

        while (i < n || j < k) {
            if (i < n) res.append(word1.charAt(i++));
            if (j < k) res.append(word2.charAt(j++));
        }
        return res.toString();
    }
}
