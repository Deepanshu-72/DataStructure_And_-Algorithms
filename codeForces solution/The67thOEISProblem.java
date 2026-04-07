import java.util.Scanner;

public class The67thOEISProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();

            int[] arr = new int[n+1];

            arr[1] = 1;

            System.out.print(1 + " ");
            for(int i = 2; i<=n; i++){
                arr[i] = 2* arr[i-1];
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
    }
}
