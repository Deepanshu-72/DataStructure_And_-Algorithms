import java.util.Arrays;
import java.util.Scanner;

public class multidimision {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3]; // Declare a 3x3 array

        // Taking user input for the array
        System.out.println("Enter 9 elements for the 3x3 array:");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = in.nextInt();
            }
        }


        for (int i =0; i<3; i++){
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}