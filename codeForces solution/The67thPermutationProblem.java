import java.util.ArrayList;
import java.util.Scanner;

public class The67thPermutationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();




            int count = n;
            int finall = 3 * n;

            for (int i = 0; i < n; i++) {
                System.out.print(finall + " " + (finall - 1) + " " + count + " ");
                count--;
                finall -= 2;
            }

            System.out.println();
        }
    }
}
