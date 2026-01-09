import java.util.*;
import java.util.TreeMap;

public class Visa_OA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();

        String[] query = new String[q];


        for(int i = 0; i<q ; i++){
            query[i] = sc.next();
        }

        TreeMap<Integer, Integer> set1 = new TreeMap<>();
        TreeMap<Integer, Integer> set2 = new TreeMap<>();

        for(int i= 0; i<n; i++){

            if(arr[i] == 0){
                set1.put(i,0);
            }
            else {
                set2.put(i,1);

            }

        }

        for(int i = 0; i<q;i++){

            if(query[i] .equals("L")){
                if(!set1.isEmpty()){
                    int first = set1.firstKey();
                    set1.remove(first);
                    set2.put(first,1);
                }
            }else {
                int j = Integer.parseInt(query[i].substring(1));

                if(set2.containsKey(j)){
                    set1.put(j,0);
                    set2.remove(j);
                }


            }


        }

        char[] ans = new char[n];
        Arrays.fill(ans, '1');
        for (int key : set1.keySet()){
            ans[key] = '0';
        }


        System.out.println(new String(ans));






    }
}
