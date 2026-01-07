import java.util.Scanner;

public class AmazonOA_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        for (int i = 1; i<=n; i++ ){
            a[i] = sc.nextInt();
        }
        for (int i = 1; i<=n; i++ ){
            b[i] = sc.nextInt();
        }

        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];


        if (b[1] == 0) {
            dp1[1] = 0;
            dp2[1] = a[1];
        } else {
            dp1[1] = a[1];
            dp2[1] = a[1];
        }

        for (int i = 2; i <= n; i++) {
            if (b[i] == 0) {
                dp1[i] = dp1[i - 1];
                dp2[i] = a[i] + dp1[i - 1];
            } else {
                dp1[i] = Math.max(a[i] + dp1[i - 1], dp2[i - 1]);
                dp2[i] = a[i] + dp2[i - 1];
            }
        }

        System.out.println(dp1[n]);
        sc.close();
    }
}
