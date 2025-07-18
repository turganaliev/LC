package arraysandhashing.sortanarray_912;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private void countingSort(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();

        int minVal = arr[0];
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            minVal = Math.min(minVal, arr[i]);
            maxVal = Math.max(maxVal, arr[i]);
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        int index = 0;
        for (int val = minVal; val <= maxVal; val++) {
            while (count.getOrDefault(val, 0) > 0) {
                arr[index] = val;
                index++;
                count.put(val, count.get(val) - 1);
            }
        }
    }
    public int[] sortArray(int[] nums) {
        countingSort(nums);
        return nums;
    }
}