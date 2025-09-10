/*
    Question:-
        Write a Java program to add all element of
        given 2D array of integers
*/

package Multidimensional_Arrays;

public class Sum_ofAll_element_in2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,-9,3},{5,10,3}};
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }



}
