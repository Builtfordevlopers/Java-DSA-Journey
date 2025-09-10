/*
    Question:-
        Write a Java program to find the largest element of
        given 2D array[] of integers
*/
package Multidimensional_Arrays;

public class Largest_element_in_2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,-9,3},{5,10,3}};
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                mx = Math.max(mx,arr[i][j]);
            }
            System.out.println();
        }

        System.out.println(mx);
    }
}
