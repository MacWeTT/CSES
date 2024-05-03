import java.util.*;

public class Weird_Algorithm {
    public static void solve(long n) {
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (n * 3) + 1;

            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solve(n);
        scanner.close();
    }

}