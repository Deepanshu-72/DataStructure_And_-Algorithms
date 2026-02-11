import java.util.Scanner;

public class Divisible_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();


            int[] ans = new int[n];
            int j = 1;
            for(int i = n-1; i>=0; i = i-2){
                ans[i] = j;
                j++;
            }
            int k = n;
            for(int i = n-2; i>=0; i =i-2){
                ans[i] = k;
                k--;
            }

            for (int i = 0 ; i<n ; i++){
                System.out.println(ans[i]);
            }
        }
    }
}
