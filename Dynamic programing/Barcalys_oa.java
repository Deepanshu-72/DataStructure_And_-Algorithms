import java.util.Scanner;

public class Barcalys_oa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] e = new int[n+1];
        int[] h = new int[n+1];
        int[] dp = new int[n+1];

        for (int i = 1 ; i<= n ; i++){
            e[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        dp[1] = Math.max(e[1], h[1] );
        for(int i = 2; i<= n ; i++){
            dp[i] = Math.max(e[i] + dp[i-1], h[i] + dp[i-2]);
        }

        System.out.println(dp[n]);
    }
}
