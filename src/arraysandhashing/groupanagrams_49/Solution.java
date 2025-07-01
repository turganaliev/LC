package arraysandhashing.groupanagrams_49;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : strs) {
            char[] sorted_word = word.toCharArray();
            Arrays.sort(sorted_word);
            String anagram = new String(sorted_word);

            if (!anagrams.containsKey(anagram)) {
                anagrams.put(anagram, new ArrayList<>());
            }
            anagrams.get(anagram).add(word);
        }
        return new ArrayList(anagrams.values());
    }
}
