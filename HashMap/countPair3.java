import java.util.HashMap;

public class countPair3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int k = 6;
        System.out.println(count(arr, k));

    }

    static int count(int arr[], int k){
        int count =0 ;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i= arr.length-1 ; i>= 0; i--){
            int val1 = arr[i] - k;
            int val2 = arr[i] + k;


            if(map.containsKey(val1)){
                count += map.get(val1);
            }

            if(k != 0 && map.containsKey(val2)){
                count += map.get(val2);
            }


            map.put(arr[i], map.getOrDefault(arr[i], 0)+1 );
        }

        return count;

    }
}
