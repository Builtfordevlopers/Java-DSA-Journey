/*
METHOD 1

Hint
# # # # # *
# # # # * *
# # # * * *
# # * * * *
# * * * * *
* * * * * *

Expected Output

          *
        * *
      * * *
    * * * *
  * * * * *
* * * * * *

SOLUTION
when i+j >= n+1 print *
 */


package Pattern_Printing.Special2_Pattern;

public class StarTriangleFlipped {
    public static void main(String[] args) {
        int n = 6 ;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i + j >= n+1){
                    System.out.print("*" + " ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
