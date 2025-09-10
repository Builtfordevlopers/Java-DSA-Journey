/*
    Question:-
        Store Transpose value into new 2dArray

    Objective:-
        To Understand row wise printing and colum wise printing
        performing Transpose operation on 2dArray.
*/

package Multidimensional_Arrays;

import java.util.Scanner;

public class Storing_transposeValue_inNew2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row Number: ");
        int n = sc.nextInt();
        System.out.println("Enter Colum Number: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[][] brr = new int[n][m];


        System.out.println("Enter Normal Arrays Value: ");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Normal Value");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Transpose Value");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                brr[i][j] = arr[j][i];
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
