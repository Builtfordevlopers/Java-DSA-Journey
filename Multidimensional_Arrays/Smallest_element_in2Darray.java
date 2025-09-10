/*
    Question:-
        Write a Java program to find the element element of
        given 2D array[] of integers
*/

package Multidimensional_Arrays;

public class Smallest_element_in2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,-9,3},{5,10,3}};
        int sm = Integer.MAX_VALUE;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                sm = Math.min(sm,arr[i][j]);
            }
        }
        System.out.println(sm);
    }
}
