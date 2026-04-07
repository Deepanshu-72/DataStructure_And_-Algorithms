import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Next {

    static ArrayList<Long> getPrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        ArrayList<Long> primes = new ArrayList<>();

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add((long) i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        ArrayList<Long> primes = getPrimes(2000000);

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            a[0] = primes.get(0);

            for (int i = 1; i < n; i++) {
                a[i] = primes.get(i - 1) * primes.get(i);
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

}
