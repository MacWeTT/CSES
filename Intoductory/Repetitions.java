import java.util.*;

/**
 * Repetitions
 */
public class Repetitions {
    public static int solve(String input) {
        char last = '$';
        int max = 0, total = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != last) {
                last = input.charAt(i);
                total = 1;
            } else {
                total += 1;
            }
            max = Math.max(max, total);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solve(input));
        scanner.close();
    }
}