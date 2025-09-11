/*
   ------------|
  |---------|  |
  | |---|   |  |
  | |   |   |  |
  | |   |   |  |
  | |-------|  |
  |------------| Spiral form
*/

package Multidimensional_Arrays;

public class Spiral {

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
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        int m = arr.length; // Row
        int n = arr[0].length;// Colum

        System.out.println("Normal Print");
        print(arr);

        //spiral Print
        int minr=0, maxr = m -1; //row
        int minc=0, maxc = n-1; //col

        while(minr <=maxr && minc <= maxc){
            //let to rignt
            //Blue  rowMin constant and colMin to colMax
            for (int j = minc; j <=maxc; j++) {
                System.out.print(arr[minr][j]+ " ");
            }
            minr++;

            if(minr > maxr || minc > maxc) break;
            //top to bottom
            //Orange colMax constant and row min to max
            for (int i = minr; i <=maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;

            if(minr > maxr || minc > maxc) break;
            //Right to left
            //Red maxRow constant and colMax to colMin
            for (int j = maxc; j >=minc; j--) {
                System.out.print(arr[maxr][j] + " ");
            }
            maxr--;

            if(minr > maxr || minc > maxc) break;
            //bottom to top
            //Green ColMin constant and maxRow to MinRow
            for (int i = maxr; i >=minr; i--) {
                System.out.print(arr[i][minc] + " ");
            }
            minc++;

        }
    }
}
