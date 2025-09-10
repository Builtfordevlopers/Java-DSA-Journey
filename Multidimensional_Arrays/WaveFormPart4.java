/*
    |----|    |----|    |
    |    |    |    |    |
    |    |    |    |    |
    |    |____|    |____| wave form implemented
*/


package Multidimensional_Arrays;

public class WaveFormPart4 {
    public static void print(int[][] arr){

        for(int[] ele : arr){
            for(int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = arr.length; // Row
        int n = arr[0].length;// Colum

        //Normal Print
        System.out.println("Normal Question");
        print(arr);

        //Transpose
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Print
        System.out.println("Transpose Print");
        print(arr);

        //Wave form

        System.out.println("Wave form");

        for (int i = 0; i <m; i++) {
            if(i%2==0){
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }else {
                for (int j = 0; j <n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }


    }
}
