package arraysandhashing.rangeaddition_370;

public class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {

        int[] updated_array = new int[length];

        for (int[] update : updates) {
            int startIndex = update[0];
            int endIndex = update[1];
            int increment = update[2];

            updated_array[startIndex] += increment;

            if (endIndex + 1 < length) {
                updated_array[endIndex + 1] -= increment;
            }
        }
        for (int i = 1; i < length; i++) {
            updated_array[i] += updated_array[i - 1];
        }
        return updated_array;
    }
}