import java.util.Arrays;
import java.util.Scanner;

public class Amazon_OA_2026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c =0;
        if (!checkSort(s)) {
            s = sortSubstring(s, 0, s.length() - 2);
            c++;

            if (!checkSort(s)) {
                s = sortSubstring(s, 1, s.length() - 1);
                c++;

                if (!checkSort(s)) {
                    s = sortSubstring(s, 0, 1);
                    c++;
                }
            }
        }

        System.out.println(c);




    }
    public static boolean checkSort(String s){
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;

    }

    public static String sortSubstring(String s, int l, int r) {
        char[] arr = s.toCharArray();


        char[] sub = Arrays.copyOfRange(arr, l, r + 1);


        Arrays.sort(sub);

        for (int i = l; i <= r; i++) {
            arr[i] = sub[i - l];
        }

        return new String(arr);
    }

}
