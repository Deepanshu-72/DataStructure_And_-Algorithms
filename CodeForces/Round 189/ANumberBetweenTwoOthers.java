import java.util.Scanner;

public class ANumberBetweenTwoOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = 0;
            int i = 2;
            boolean flag = true;
            while(z<y){
                z = i*x;
                if(z% x == 0){
                    if(y % z != 0){
                        System.out.println("yes");
                        flag = false;
                        break;

                    }

                }

                i++;

            }

            if(flag){
                System.out.println("No");
            }
        }
    }
}
