import java.util.Scanner;

public class OIEExcursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int same = 1;
            boolean flage = true;
            for (int i =1; i<n ; i++){
                if(arr[i] == arr[i-1]){
                    same++;
                }else {
                    same = 1;
                }
                if(same >= m){
                    System.out.println("no");
                    flage = false;
                    break;

                }
            }
            if(flage) {
                System.out.println("yes");
            }
        }
    }
}
