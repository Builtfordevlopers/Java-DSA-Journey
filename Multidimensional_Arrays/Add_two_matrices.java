/*
    Question:-
        Add Two Matrices

     Learning:-
        Both Arrays need to be SAME else Addition is not possible in 2D array.
*/

package Multidimensional_Arrays;

public class Add_two_matrices {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},{7,8,9,1,2,3},{4,5,6,7,8,9}};
        int[][] brr = {{9,8,7,6,5,4},{3,2,1,9,8,7},{6,5,4,3,2,1}};
        int[][] res = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                res[i][j] = arr[i][j] + brr[i][j];
            }
        }

        for (int[] ele : res){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
