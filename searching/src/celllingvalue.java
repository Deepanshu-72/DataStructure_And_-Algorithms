public class celllingvalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,12};
        int ans = bcsearch(arr, 21);
        System.out.println(ans);
    }

    static int bcsearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        if(target>arr[e]){
            System.out.println("out of the bound arr");
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;

            } else {
                e = mid - 1;

            }
        }
        return arr[s];

    }
}