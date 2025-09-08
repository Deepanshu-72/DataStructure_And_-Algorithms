public class check_sort {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};

        System.out.println(check(arr1, 0)); // true
        System.out.println(check(arr2, 0));

    }
    static  boolean check(int [] arr, int i){

        if(i == arr.length-1){


                    return true ;
        }
        if (arr[i] > arr[i+1]) {
           return  false;

        }
       return  check(arr, i+1);
    }
}
