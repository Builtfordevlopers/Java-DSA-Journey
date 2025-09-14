/*
LEETCODE 73
  Method 1  --- Not efficient algorithm according to time and space complexcity
  class Solution {
    public void setZeroes(int[][] arr) {
            int m = arr.length; //row
            int n = arr[0].length; //col

            int[][] helper = new int[m][n]; // use to check

            for(int i =0; i<m; i++){ // helper copy
                for(int j =0; j<n; j++){
                    helper[i][j] = arr[i][j];
                }
            }

            for(int i =0; i<m; i++){
                for(int j =0; j<n; j++){

                    if(helper[i][j] == 0){
                        //set ith row and jth colum in arr
                        for(int b =0; b<n; b++){ //row j++ j is b here
                            arr[i][b] =0;
                        }
                         for(int a =0; a<m; a++){ //colum i++ i is a here
                            arr[a][j] =0;
                        }
                    }
                }
            }
    }
}

// Method 2

class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length; //row
        int n = arr[0].length; //col

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];


        //marking the the particular row and colum
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }


        // set the true rows into 0

        for(int i=0; i<m; i++){
          if(row[i] == true){
            for(int j=0; j<n; j++){
                arr[i][j] = 0;
            }
          }
        }

        // set the true colms into 0

        for(int j=0; j<n; j++){
               if(col[j] == true){
                    for(int i=0; i<m; i++){
                        arr[i][j] = 0;
                    }
               }
         }




*/

package Multidimensional_Arrays;

public class SetMatrices_Zero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = matrix.length;
        int n = matrix[0].length;

        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        // Step 1: Check if the first row and column need to be zeroed
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }

        // Step 2: Use the first row/col as markers for the rest of the matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 3: Set elements to zero based on the markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Handle the first row and column last
        if (isFirstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (isFirstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        for(int[] ele : matrix){
            for(int el : ele){
                System.out.print(el + " ");
            }
            System.out.println();
        }

    }
}
