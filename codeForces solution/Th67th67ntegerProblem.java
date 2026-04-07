import java.util.Arrays;
import java.util.Scanner;

public class Th67th67ntegerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while (t-- >0){
            int[] arr = new int[7];
            int ans = 0;
            for (int i = 0; i<7; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i<6; i++){
                arr[i] = -1 * arr[i];
            }

            for (int i = 0; i<7; i++){
              ans +=  arr[i] ;
            }

            System.out.println(ans);

        }
    }
}
