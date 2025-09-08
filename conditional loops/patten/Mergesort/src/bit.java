import java.util.Arrays;

public class bit {
    public static void main(String[] args) {
        int[] arr = {3,4,6,2,6,1,1,1,24,5,6,6,5,5,7};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static  void quicksort(int[] arr, int low , int hi){
        if(low>= hi){
            return;
        }
        int s = low;
        int e = hi;
        int mid = s+(e-s)/2;
        int piv = arr[mid];

        while (s<=e){
            while(arr[s]< piv){
                s++;
            }
            while (arr[e] > piv){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quicksort(arr, low,e);
        quicksort(arr, s, hi);



    }
}
