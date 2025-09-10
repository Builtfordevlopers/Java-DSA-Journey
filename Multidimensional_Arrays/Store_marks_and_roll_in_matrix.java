/*
    Question:-
        Write a program to store roll number and marks
        obtained by 4 students side by in a matrix.

     Objective:-
        To Lear Input output in 2D Array.
*/

package Multidimensional_Arrays;

import java.util.Scanner;

public class Store_marks_and_roll_in_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr= new int[4][2];

        //input
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
