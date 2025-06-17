package arraysandhashing.twosum_1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> main = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (main.containsKey(j)) {
                return new int[]{main.get(j), i};
            } else {
                main.put(nums[i], i);
            }
        } return new int[]{};
    }
}
