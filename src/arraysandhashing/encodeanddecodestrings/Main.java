package arraysandhashing.encodeanddecodestrings;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strings = {"neet","code","love","you"};
        System.out.println(solution.encode(List.of(strings)));
        String string = solution.encode(List.of(strings));
        System.out.println(solution.decode(string));
    }
}
