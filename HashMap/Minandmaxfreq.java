import java.util.HashMap;
import java.util.Map;

public class Minandmaxfreq {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        int[] res = minmax(arr);

        System.out.println("Max freq element = " + res[0]);
        System.out.println("Min freq element = " + res[1]);

    }

    public static int[] minmax(int[] arr){
        int maxEle= -1;
        int minEle = -1;

        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;


        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            int g = map.getOrDefault(arr[i], 0);
            map.put(arr[i], g+1);


        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            int element = entry.getKey();
            int count = entry.getValue();

            if(count>maxCount){

                maxCount = count;
                maxEle = element;

            }

            if(count<minCount){

                minCount = count;
                minEle = element;

            }


        }

        return new int[]{maxEle, minEle};




    }


}
