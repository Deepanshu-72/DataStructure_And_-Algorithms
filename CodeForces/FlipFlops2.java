import java.util.Arrays;
import java.util.Scanner;

public class FlipFlops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (c >= a[i]) {

                    long canUse = Math.min(k, c - a[i]);

                    k -= canUse;

                    long newA = a[i] + canUse;

                    c += newA;

                } else {
                    break;
                }
            }

            System.out.println(c);
        }
    }
}
