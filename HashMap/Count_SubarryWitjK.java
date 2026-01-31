import java.util.*;
import java.util.HashMap;

public class Count_SubarryWitjK {
    public static void main(String[] args) {
        int[] arr =  {2,4,-3,2,5,-1,2};
        int k =3;
        int ans = count(arr, k);
        System.out.println(ans);


    }
    public static int count(int[] arr, int k){
        int count = 0;
        int prefix= 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int n = arr.length;
        for(int i= 0 ; i<n ; i++){


            prefix += arr[i];

            int temp = prefix - k;


            if(map.containsKey(temp)){
                count += map.get(temp);
            }

            map.put(prefix,map.getOrDefault(prefix, 0) +1);


        }


        return  count;

    }
}
