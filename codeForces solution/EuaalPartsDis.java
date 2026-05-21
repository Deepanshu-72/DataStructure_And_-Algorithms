import java.util.Scanner;

public class EuaalPartsDis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long cost = 0;
            if(n >= 3) {
                if (3 * a > b) {
                    cost += (n / 3) * b;
                    n = n % 3;

                } else {
                    cost += n * a;
                    n = 0;
                }
            }
            cost += Math.min(n*a, b);

            System.out.println(cost);
        }
    }


}
