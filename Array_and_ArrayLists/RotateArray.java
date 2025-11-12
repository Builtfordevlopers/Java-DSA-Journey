package Array_and_ArrayLists;

import java.util.Scanner;



public class RotateArray {

    public static void reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter how many time you want to rotate the array");
        int k = sc.nextInt();

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
