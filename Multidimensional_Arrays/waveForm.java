/*
    ------------|
                |
                |
    |-----------|
    |
    |
    |____________  wave form printing on 2D Array
*/

package Multidimensional_Arrays;

public class waveForm {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = arr.length; // Row
        int n = arr[0].length;// Colum

        for (int i = 0; i <m; i++) {
            if(i%2 ==0){
                for (int j = 0; j <n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }else {
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
