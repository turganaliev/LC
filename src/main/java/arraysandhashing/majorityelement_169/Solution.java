package arraysandhashing.majorityelement_169;

class Solution {
    public int majorityElement(int[] nums) {
        int curr = nums[0];
        int count = 0;
        for (int n : nums) {
            if (count == 0) curr = n;
            if (n == curr) count++;
            else count--;
        }
        return curr;
    }
}
