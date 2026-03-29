//import java.util.Scanner;

import java.util.*;
public class Zscaler {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 1; i<= n; i++){
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int count = 0;

        while(map.size()>1){
            int y = map.lastKey();
            int z =map.get(y);
            count += z;
            map.remove(y);
            int a = map.lastKey();
            map.put(a, map.get(a)+z);

        }
        System.out.println(count);
    }
}
