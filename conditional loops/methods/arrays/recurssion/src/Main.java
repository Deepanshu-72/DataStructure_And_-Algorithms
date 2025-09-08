//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(prime(71));

    }

    static boolean prime(int n){
        if (n <= 1) return false; // 0, 1, negatives are not prime
        if (n <= 3) return true;
        for(int i = 2; i*i<=n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }
}