package arraysandhashing.sortcolors_75;

class Solution {
    public int[] sortColors(int[] nums) {
        int n = nums.length;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int temp = nums[pos];
                nums[pos++] = nums[i];
                nums[i] = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] == 1) {
                int temp = nums[pos];
                nums[pos++] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}