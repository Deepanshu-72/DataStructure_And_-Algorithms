import java.util.Scanner;

public class ZhilyandArrayOperating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n - 1; i++) {
                if (a[i] <= 0 && a[i] + a[i + 1] > 0) {
                    a[i] += a[i + 1];
                }
            }

            int ans = 0;

            for (long x : a) {
                if (x > 0) ans++;
            }

            System.out.println(ans);

        }
    }
}
