public class SumofRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int l = 1;
        int r = 3; // sum from index 1 to 3 (2 + 3 + 4)
        System.out.println(sum(arr, l, r));

    }

    static int sum(int[] arr, int l, int r){
        int[] prefx = new int[arr.length];

        prefx[0]= arr[0];

        for (int i=1; i< prefx.length; i++){
            prefx[i]= arr[i]+prefx[i-1];
        }

        int sum = prefx[r]-prefx[l-1];

        return  sum;

    }
}
