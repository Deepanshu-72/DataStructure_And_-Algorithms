import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            String s = sc.next();
            int n = s.length();
            int [] arr = new int[n];
            char[] ch = s.toCharArray();
            for(int i = 0 ; i<n ;i++){
                if(ch[i] == 'b'){
                    arr[i] = 1;
                }
            }

            if(check01(arr) || check10(arr)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

        }
    }


    static boolean check10(int [] arr){
        ArrayList<Integer> list = new  ArrayList<>();
        int n = arr.length;
        int[] tem = new int[n];
        for (int i = 0 ; i< n ; i = i+2){
            tem[i] = 1;
        }

        for (int i = 0 ; i< n ; i++){
            if(arr[i] != tem[i]){
                list.add(i);
            }
        }


        if(isSoretd(list)){
            return  true;
        }
        return  false;


    }


    static boolean check01(int [] arr){
        ArrayList<Integer> list = new  ArrayList<>();
        int n = arr.length;
        int[] tem = new int[n];
        for (int i = 1 ; i< n ; i = i+2){
            tem[i] = 1;
        }

        for (int i = 0 ; i< n ; i++){
            if(arr[i] != tem[i]){
                list.add(i);
            }
        }


        if(isSoretd(list)){
            return  true;
        }
        return  false;


    }

     static boolean isSoretd(ArrayList<Integer> list){
        int n = list.size();
        for (int i = 0 ; i<n -1 ; i++){
            if(list.get(i+1) != (list.get(i) +1)){
                return  false;
            }
        }
        return  true;

    }
}
