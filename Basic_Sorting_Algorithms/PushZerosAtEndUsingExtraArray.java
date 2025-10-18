package Basic_Sorting_Algorithms;

import java.util.ArrayList;

public class PushZerosAtEndUsingExtraArray {
    public static void main(String[] args) {
        int arr[] = {1, 0, 52, 1, 0, 152, 45, 0, 415, 0, 54, 410, 0};
        int n = arr.length;

        ArrayList<Integer> brr = new ArrayList<>(n);
        int noz =0;
        for (int i = 0; i <n-1; i++) {
            if(arr[i] != 0){
                brr.add(arr[i]);
            }else {
                noz++;
            }
        }
        for (int i = 0; i <noz; i++) {
            brr.add(0);
        }

        for (int ele : brr){
            System.out.print(ele + " ");
        }

    }
}
