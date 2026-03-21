import java.util.Arrays;
import java.util.Scanner;

public class FlipFlops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n+1];
            for(int i = 1 ; i<=n; i++){
                arr[i] = sc.nextInt();

            }

            Arrays.sort(arr);

            for(int i = 1; i<=n ; i++){
                if(arr[i]<= c){
                    int x = arr[i];
                    int req = c - x;
                    if(k>= req){
                        k = k-req;
                        c = c+req+arr[i];
                    }else if(k>0 && k<req){
                        c = c+k+arr[i];
                        k =0;

                    }else{
                        c = c+arr[i];
                    }

                }else{
                    break;
                }
            }

            System.out.println(c);

        }
    }
}
