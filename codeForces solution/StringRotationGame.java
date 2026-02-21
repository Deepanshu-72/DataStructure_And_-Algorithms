import java.util.Scanner;

public class StringRotationGame {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){

            int count = 0;
            int n = sc.nextInt();
            String str = sc.next();
            char[] arr = str.toCharArray();
            count = countd(arr);
            if (count == n  || count == 1){
                System.out.println(count);
            }else{
                for(int i = 1 ; i< n ; i++){
                    if(arr[i] == arr[i-1]){
                        int k = (n-1) - (i-1);
                        rotate(arr, k );
                        count= Math.max(count, countd(arr));

                        System.out.println(count);
                        break;


                    }
                }


            }




        }

    }

    public  static void rotate(char[] arr, int k){
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);



    }

    static void   reverse(char[] arr , int s , int e){
        while(s<e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;

        }





    }


    public static int countd(char[] arr){
        int countl= 1;
        for(int i = 1; i< arr.length; i++){
            if(arr[i] != arr[i-1]){
                countl++;
            }
        }


        return countl;

    }
}
