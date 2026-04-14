import java.util.Scanner;

public class GridCovering {


    static void processTestCase(Scanner sc) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long dx = sc.nextLong();
        long dy = sc.nextLong();

        long rowAlignment = gcd(n, dx);
        long columnAlignment = gcd(m, dy);
        long gridAlignment = gcd(n, m);

        if (rowAlignment == 1 && columnAlignment == 1 && gridAlignment <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            processTestCase(sc);
        }
    }
}
