package stack.validparentheses_20;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isValid("(]"));
        System.out.println(sol.isValid("()[]{}"));
    }
}
