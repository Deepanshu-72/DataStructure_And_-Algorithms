import java.util.Arrays;

public class inplacemerge {
    public static void main(String[] args) {
        int[] arr = {3,4,6,2,6,1,1,1,24,5,6,6,5,5,7};
         mergesortinp(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    static void mergesortinp(int[] arr, int s, int e){
        if(s==e){
            return ;
        }
        int mid = s+(e-s)/2;

         mergesortinp(arr, s, mid);
         mergesortinp(arr,mid+1, e);

         merge(arr,s,mid ,e);
    }

    static void merge(int[] arr , int s, int m ,  int e){
        int[] mix = new int[e-s +1 ];
        int i = s;
        int j = m+1;
        int k =0;

        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;

            }
            k++;
        }
        while (i<=m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j<=e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0 ; l<mix.length; l++){
            arr[s+l] = mix[l];
        }

    }
}
