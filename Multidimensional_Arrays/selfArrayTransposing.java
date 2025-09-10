/*
    Question:-
        Transpose 2D Array itself. Without using extra array
*/

package Multidimensional_Arrays;

import java.util.Scanner;

public class selfArrayTransposing {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =4, m=4;
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};

        // Normal Array printing
        System.out.println("Normal Array");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //Transposing itself
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =temp;
            }
        }
        System.out.println();
        //Printing Transposing values
        System.out.println("Transposed Values");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
