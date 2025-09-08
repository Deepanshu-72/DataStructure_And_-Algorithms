//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,5,55,88,99,333,66,8765,345678};
        int target = 56;
        int ans = linearsearch(nums , target);
        System.out.println(ans);
    }

    private static int linearsearch(int[] arr, int target) {

        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i< arr.length; i++){

            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}