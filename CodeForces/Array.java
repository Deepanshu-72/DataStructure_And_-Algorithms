import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] arr = new int[n+1];
            int[] max = new int[n+1];
            int[] min = new int[n+1];
            for (int i =1; i<=n; i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i<=n; i++){
                for (int j=i+1; j<=n; j++){
                    if(arr[j] > arr[i]){
                        max[i]++;
                    }
                    else if(arr[j] < arr[i]) {
                        min[i]++;
                    }

                }
            }

            for(int i = 1; i<=n; i++){
                System.out.println(Math.max(max[i],min[i] ));
            }
        }
    }
}
