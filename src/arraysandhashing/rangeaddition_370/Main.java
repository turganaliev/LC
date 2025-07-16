package arraysandhashing.rangeaddition_370;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] updates = {
                {0, 0, 1},
                {1, 3, 3},
                {0, 2, -2},
                {2, 4, 5}};

        int length = 5;

        System.out.println(Arrays.toString(solution.getModifiedArray(length, updates)));
    }
}
