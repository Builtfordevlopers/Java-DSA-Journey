/*
Low ke phele sare Zero Hone Chahiye
Mid ke phele sare One Hone Chahiye
high ke baad sare TWO Hone Chahiye
*/



package Basic_Sorting_Algorithms;

public class DutchFlagAlgorithm {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;

       int low = 0;
       int mid = 0;
       int high = n-1;

       while(mid <= high){
           if(arr[mid] == 0){
               swap(arr, low, mid);
               mid++;
               low++;
           }else if(arr[mid] == 1){
               mid++;
           }else{
               swap(arr, mid, high);
               high--;
           }
       }

        // output
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
