import java.util.Scanner;

public class AtLanssia70LPA {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for(int i = 0 ; i<N; i++){
            arr[i] = sc.next();

        }

        int m = sc.nextInt();



        int sum = 1;
        for(String str : arr){
            int val = 1;
            for(char ch : str.toCharArray()){
                int ass = (int) ch;
                if(isEven(ass)){

                    if(val == 1){
                        val = 2;

                    } else if (isEven(val)) {
                        val = 2;

                    }
                    else {
                        val = 3;
                    }

                }
                else {

                    if(val == 1){
                        val = 3;

                    }else if (isEven(val)) {
                        val = 3;

                    }else {
                        val = 2;
                    }
                }


            }

            if(sum == 1){
                sum = val;
            } else if (isEven(sum)) {

                if(isEven(val)){
                    sum =2;
                }
                else {
                    sum = 3;
                }

            }else {
                if (isEven(val)) {
                    sum = 3;

                }else {
                    sum = 2;
                }


            }


        }

        boolean ans = isEven(sum);
        if(ans){
            System.out.println("even");
        }
        else System.out.println("odd");



    }

    public static boolean isEven(int n){

        if((n & 1) ==  0){
            return true;
        }
        return false;

    }
}
