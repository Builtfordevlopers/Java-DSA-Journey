package Array_and_ArrayLists;

import java.util.Scanner;

public class Reverse {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int[] arr = {10, 20, 30, 40, 50, 60 };

        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;

        int  i =1;
        int j = n-2;

        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
