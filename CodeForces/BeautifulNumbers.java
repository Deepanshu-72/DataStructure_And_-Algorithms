import java.util.Scanner;

public class BeautifulNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){

            long n = sc.nextLong();
            int count = 0;
            if(check(n)){
                System.out.println(count);
            }
            else{
                
            }



        }

    }

    public static long sum(long x){
        long ans = 0;
        while (x > 0){
            long y = x % 10;
            ans += y;
            x = x/10;

        }
        return ans;
    }

    public static boolean check(long x){
        boolean ans = false;
        long y = sum(x);
        long z = sum(y);
        if(y == z){
            ans = true;
        }
        return  ans;
    }
}
