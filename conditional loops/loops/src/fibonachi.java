import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i < num; i++) {
            int temp = b;
             b = a+b;
             a = temp;

        }
        System.out.println(b);
    }
}