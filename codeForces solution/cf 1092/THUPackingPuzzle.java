import java.util.Scanner;

public class THUPackingPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long count = 0 ;


            if(a != 0 && c !=0){
                long x = Math.min(a, c);
                count += x * 4;
                a = a- x;
                b = b-x;

            }

            if(a != 0 && b !=0){
                long x = Math.min(a, b);
                count += x * 5;
                a = a- x;
                b = b-x;

            }


            if(a != 0){
                if(a % 2 == 0){
                    count += (a/2) * 5;
                }
                else {
                    count += (a/2) * 5;
                    count += 3;
                }
                a = 0;
            }

            if(b != 0){
                count += b*3;

            }

            if(c != 0){
                count += c*3;

            }

            System.out.println(count);

        }
    }
}
