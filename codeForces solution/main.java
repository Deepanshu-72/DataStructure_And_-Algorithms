import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            int[] arr = new int[n];

            for(int i = 0 ; i<n; i++){
                arr[i] = s.charAt(i) - '0';

            }
            int max = countMax(arr);
            int min = countMin(arr);

            System.out.println(min);
            System.out.println(max);



        }
    }

    public static int countMax(int[] arr){
        int n = arr.length;
        int count = 0;


        for(int i = 1 ; i<n-1; i++){

            if(arr[i-1] == 1 && arr[i+1] ==1){
                arr[i]= 1;

            }
        }

        for(int i = 0 ; i<n; i++){

            if(arr[i] ==1){
                count++;
            }
        }
        return count;

    }
    public static int countMin(int arr[]){
        int n = arr.length;
        int count = 0;

        for(int i = 1 ; i<n-1; i++){

            if(arr[i-1] == 1 && arr[i+1] ==1){
                arr[i]= 0;

            }
        }

        for(int i = 0 ; i<n; i++){

            if(arr[i] ==1){
                count++;
            }
        }
        return count;


    }
}
