package arraysandhashing.rangesumquerryimmutable_303;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray solution = new NumArray(nums);

        System.out.println(solution.sumRange(0, 2));
        System.out.println(solution.sumRange(2, 5));
        System.out.println(solution.sumRange(0, 5));
    }
}
