package Basic_Sorting_Algorithms;

import java.util.Arrays;

public class ZerosOns {
    public static void main(String[] args) {
        int arr[] = { 0, 1,0, 1,0, 1, 0, 1, 0,1 ,0, 1, 0, 1,0,0, 1,0, 1, 1, 1, 0, 0, 0, 0,0 ,1, 0, 1};

        // Method 1
        Arrays.sort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print( arr[i] +" ");
        }


        // Method 2
        int noZeros =0;
        int noOns =0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==0){
                noZeros++;
            }else {
                noOns++;
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            if(i <= noZeros){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }
}
