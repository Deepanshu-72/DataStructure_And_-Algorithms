import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long cT = sc.nextLong();
            long cH = sc.nextLong();
            long cU = sc.nextLong();

            long n = 2 * (cT + cH) + 3 * cU;

            System.out.println(n);
        }
    }
}
