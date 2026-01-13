import java.util.Scanner;

public class Atlassian_OA {
    public static long min(long a,long b,long c ){
        return Math.min(a, Math.min(b,c));
    }

    public static long max(long a,long b,long c ){
        return Math.max(a, Math.max(b,c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t -->0){
            int b = sc.nextInt();
            long dp1[] = new long[b+1];
            long dp2[] = new long[b+1];
            dp1[0]=1;
            dp2[0]=1;

            for(int i =1 ; i<=b; i++){
                String line = sc.next();
                char g = line.charAt(0);
                int no =0;
                if(line.length()>1) {
                     no = Integer.parseInt(line.substring(1));
                }
                if(g == '+'){
                    dp1[i] = max(dp1[i-1],  dp1[i-1] + no, dp2[i-1] + no );
                    dp2[i] = min(dp1[i-1],  dp1[i-1] + no, dp2[i-1] + no );

                } else if(g == '-'){
                    dp1[i] = max(dp1[i-1],  dp1[i-1] - no, dp2[i-1] - no );
                    dp2[i] = min(dp1[i-1],  dp1[i-1] - no, dp2[i-1] - no );

                } else if(g == '*'){
                    dp1[i] = max(dp1[i-1],  dp1[i-1] * no, dp2[i-1] * no );
                    dp2[i] = min(dp1[i-1],  dp1[i-1] * no, dp2[i-1] * no );

                } else if(g == '/'){
                    dp1[i] = max(dp1[i-1],  dp1[i-1] / no, dp2[i-1] / no );
                    dp2[i] = min(dp1[i-1],  dp1[i-1] / no, dp2[i-1] / no );

                } else{
                    dp1[i] = max(dp1[i-1],  dp1[i-1] * -1, dp2[i-1] * -1 );
                    dp2[i] = min(dp1[i-1],  dp1[i-1] * -1, dp2[i-1] * -1 );

                }
            }

            System.out.println(dp1[b]);

        }

    }
}
