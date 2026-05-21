import java.util.Scanner;

public class Meshoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            int n = sc.nextInt();

            int[] A = new int[n+1];
            int[] B = new int[n+1];
            int[] C = new int[n+1];

            for(int i  = 1; i<= n ; i++){
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
                C[i] = sc.nextInt();
            }

            int[][] dp = new int [n+1][4];

            dp[1][0] = dp[1][1] = Integer.MIN_VALUE;
            dp[1][2] = B[1];
            dp[1][3] = A[1];

            for(int i = 2; i<=n ; i++){
                dp[i][0]=Math.max(dp[i-1][3], dp[i-1][1]) + C[i];
                dp[i][1]=Math.max(dp[i-1][3], dp[i-1][1]) + B[i];
                dp[i][2]= Math.max(dp[i-1][2], dp[i-1][0]) + B[i];
                dp[i][3]=Math.max(dp[i-1][0], dp[i-1][2]) + A[i];

            }

            // Invalidate illegal state at position n
            dp[n][2] = Integer.MIN_VALUE;
            dp[n][0] = Integer.MIN_VALUE;

            long result = Math.max(Math.max(dp[n][0], dp[n][1]), Math.max(dp[n][2], dp[n][3]));
            System.out.println(result);
        }
    }
}
