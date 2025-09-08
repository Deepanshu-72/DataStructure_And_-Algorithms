import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,36,77,99};

        revs(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void revs(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end>start){

            swap(arr , start, end);
            start++;
            end--;
        }


    }
    static void swap(int[] arr , int ind1, int ind2){
               int temp=arr[ind1];
              arr[ind1]=arr[ind2];
               arr[ind2]=temp;
    }

}
