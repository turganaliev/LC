package arraysandhashing.majorityelement2_229;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (int key : count.keySet()) {
            if (count.get(key) > nums.length / 3) {
                ans.add(key);
            }
        }
        return ans;
    }
}
