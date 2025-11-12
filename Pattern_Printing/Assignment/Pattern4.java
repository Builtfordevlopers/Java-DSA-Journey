/*


 *           *
   *       *
     *   *
       *


 */


package Pattern_Printing.Assignment;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n*2-1 ; j++) {
//                if(i == j || i+j == 2*n){
//                    System.out.print("*" +" ");
//                }else {
//                    System.out.print(" " + " ");
//                }
//            }
//            System.out.println();
//        }
        System.out.println();



        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n*2-1 ; j++) {
                if(i == j || i+j == 2*n){
                    System.out.print("*" +" ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n*2-1 ; j++) {
                if(i == j || i+j == 2*n){
                    System.out.print("*" +" ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
