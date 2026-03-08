import java.util.Scanner;

public class Cf1_1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int mn = 0, mx = 0;
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == '1') {
                int j = i;
                int lst = i;

                while (j < n) {
                    if (s.charAt(j) == '1') {
                        lst = j;
                        j++;
                    } else {
                        if (j + 1 < n && s.charAt(j + 1) == '0') {
                            break;
                        }
                        j++;
                    }
                }

                int len = lst - i + 1;
                mx += len;
                mn += (len / 2) + 1;

                i = j;
            } else {
                i++;
            }
        }

        System.out.println(mn + " " + mx);
    }



}
