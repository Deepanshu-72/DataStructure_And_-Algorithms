import java.util.ArrayList;
import java.util.Scanner;

public class arrayl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);

        for (int i=0; i<3; i++){
            list.add(in.nextInt());
        }
        for (int i=0; i<3; i++){
            System.out.println(list.get(i));
        }


    }
}
