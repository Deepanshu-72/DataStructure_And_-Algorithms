import java.util.Scanner;

public class isDigitorialPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isDigitorialPermutation(n);
        System.out.println(ans);

    }
    public static boolean isDigitorialPermutation(int n) {
        int N = n;
        long sum = 0;
        while(N>0){
            int x = N%10;
            sum += factorial(x );
            N = N/10;




        }
        if(sum == n){
            return true;
        }

        return false;

    }
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
