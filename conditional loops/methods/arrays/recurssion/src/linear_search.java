public class linear_search {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};

        System.out.println(search(arr1, 0, 6));

    }
    static int search(int[] arr, int i, int target){
        if(arr[i] == target){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return search(arr, i+1, target);
    }
}
