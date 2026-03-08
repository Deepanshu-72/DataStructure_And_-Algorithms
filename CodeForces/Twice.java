import java.util.HashMap;
import java.util.Scanner;

public class Twice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ;i <n ; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = n-1; i>=0; i--){
                int x = arr[i];
                if(map.containsKey(x)){
                    if(map.get(x) != 0){

                        count ++;
                        map.put(x, map.get(x) - 1);

                    }
                }
                else {
                    map.put(x,map.getOrDefault(x, 0)+1);
                }



            }
            System.out.println(count);


        }
    }
}
