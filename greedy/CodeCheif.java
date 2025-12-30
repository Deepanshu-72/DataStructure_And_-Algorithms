import java.util.Scanner;

public class CodeCheif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){



            int n = sc.nextInt();
            int m = sc.nextInt();

            long [] b = new long[m+1];

            for(int i = 1; i<=m; i++){
                b[i] = sc.nextInt();
            }


            long [] a = new long[m+1];

            long [] k = new long[m+1];

            long total_a = 0;
            long count_a = 0;

            long total_k = 0;
            long count_k = 0;


            for(int i = 1; i<=m; i++ ){
                if(b[i] ==1 || b[i] == 3){
                    a[i] = 1;
                    total_a += i;
                    count_a ++;
                }

                if(b[i] ==2 || b[i] == 3){
                    k[i] = 1;
                    total_k += i;
                    count_k ++;
                }
            }


            long leftCount_a =0;
            long leftSum_a= 0;
            long leftCount_k =0;
            long leftSum_k= 0;

            for(int line = 1; line<= m; line++){
                long d = 0;
                long w = 0;
                if(a[line] ==1){
                    leftSum_a += line;
                    leftCount_a ++ ;
                    d= 1;
                    w = line;
                }

                long left1= (line*leftCount_a) - (leftSum_a);

                long right1= (total_a - leftSum_a + w) - (line *(count_a - leftCount_a + d ));


                if(k[line] == 1){

                    leftSum_k += line;
                    leftCount_k ++ ;
                    d= 1;
                    w = line;



                }

                long left2= (line*leftCount_k) - (leftSum_k);

                long right2= (total_k - leftSum_k + w) - (line *(count_k - leftCount_k + d));

                System.out.print(Math.abs((left1+right1)- (left2+right2)) + " ");


            }

            System.out.println();




        }

    }
}
