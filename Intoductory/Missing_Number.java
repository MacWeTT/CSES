import java.util.*;

/**
 * Missing_Number
 */
public class Missing_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long total = ((long) n * (n + 1)) / 2;
        for (int i = 0; i < n - 1; i++) {
            int num = scanner.nextInt();
            total -= num;
        }
        System.out.println(total);
        scanner.close();
    }
}