package Multidimensional_Arrays;

public class rowWise_and_colWisePrinting {
    public static void main(String[] args) {

        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;

        // Row wise Printing
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Colum wise printing. In other words it is Transpose
        for (int j = 0; j <n; j++) { //col
            for (int i = 0; i <m; i++) {  //row
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
