public class findno {
    public static void main(String[] args) {
      int[] arr = {12,345,2,6,7896,45};
        System.out.println(findnob(arr));
    }
    static int findnob(int[] arr){
        int count = 0;


        for (int i=0;i< arr.length;i++){
            int num= arr[i];
             if (even(num)){
                 count++;
             }

        }
        return  count;
    }
    static boolean even(int num){
        int noofDigit = digits2(num);
        if(noofDigit%2==0){
            return true;
        }
        return false;
    }

    static int digits2(int num){
        if (num < 0) {
            num = num*-1;
        }
        return (int) (Math.log10(num));
    }
    static int digits(int num){
        if (num < 0) {
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
