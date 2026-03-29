import java.util.*;

public class SimpleGcd {

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();

        long[] arr = new long[n];
        long[] brr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            brr[i] = sc.nextLong();
        }

        int count = 0;

        long first = gcd(arr[0], arr[1]);
        if (arr[0] > first) {
            count++;
        }

        for (int i = 1; i < n - 1; i++) {
            long g = gcd(arr[i], arr[i + 1]);
            long l = lcm(first, g);

            if (l < arr[i]) {
                count++;
            }

            first = g;
        }

        if (first < arr[n - 1]) {
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}