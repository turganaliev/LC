package arraysandhashing.topkfrequentelements_347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        List<Map.Entry<Integer, Integer>> pairs = new ArrayList<>(map.entrySet());
        pairs.sort((p1, p2) -> p2.getValue() - p1.getValue());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pairs.get(i).getKey();

        return res;
    }
}
