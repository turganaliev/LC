package slidingwindow.containsduplicate2_219;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(solution.containsNearbyDuplicate(nums, k));
    }
}
