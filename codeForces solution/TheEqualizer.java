import java.util.Scanner;

public class TheEqualizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            int[] arr = new int[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
                count += arr[i];
            }


            int x = n*k;
            boolean a = count%2 ==0;
            boolean b = x%2 ==0;

            if(!a || b){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }


        }
    }
}
