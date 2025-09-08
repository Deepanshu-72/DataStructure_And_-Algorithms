public class resverse {
    public static void main(String[] args) {
        System.out.println(rev(12345, 0)); // Output: 54321
    }

    static int rev(int n, int result) {
        if (n == 0) {
            return result;
        }
        int rem = n % 10;
        return rev(n / 10, result * 10 + rem);
    }
}
