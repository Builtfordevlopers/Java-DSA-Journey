/*
    Question:- LeetCode 48th Question Rotate Image
        Write a program to rotate the matrix by 90 degrees clockwise
*/


package Multidimensional_Arrays;

public class rotate2dArray_clockwise_by90Degree {

    public static void print(int[][] arr){
        int m= arr.length;
        int n = arr[0].length;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void transpose(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i <m; i++) {
            for (int j = 0; j <i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length;
        int n = arr[0].length;

        System.out.println("Normal Array");
        print(arr);

        System.out.println("Transpose Array");
        transpose(arr);
        print(arr);

        // reverse each row using two pointer
        for (int i = 0; i <m; i++) {
            int a = 0; int b = m-1;
            while(a<b){
                //swap row arr[i][a] and arr[i][b];
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }

        System.out.println("After 90Degree Rotation");
        print(arr);
    }
}
