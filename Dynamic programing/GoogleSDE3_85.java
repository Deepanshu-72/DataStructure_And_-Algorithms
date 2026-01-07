import java.util.Scanner;

public class GoogleSDE3_85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int N = sc.nextInt();
            int  y = sc.nextInt();
            int  x = sc.nextInt(); // divide 7;
            int  z = sc.nextInt();  // divide by 3;
            int  b = sc.nextInt();  // divide by 5;


            int[] dp = new int[N+1];

            dp[1]= 0;

            for(int i = 2; i<= N; i++){
                dp[i] = y + dp[i-1];

                if(i % 7 == 0 ){
                    dp[i] = Math.min(dp[i], x+ dp[i/7]);

                }

                if(i % 3 == 0 ){
                    dp[i] = Math.min(dp[i], z+ dp[i/3]);

                }

                if(i % 5 == 0 ){
                    dp[i] = Math.min(dp[i], b+ dp[i/5]);

                }
            }

            for(int i = 1 ; i<= N; i++){
                System.out.println(dp[i]);
            }


        }

    }
}
