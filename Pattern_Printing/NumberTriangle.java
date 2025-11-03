package Pattern_Printing;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(){

        int n = 6;

        // Coulam printing
        for (int i = 1; i <=n; i++) { // row
            for (int j = 1; j <=i-1; j++) { // coll
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        //Row printing
        for (int i = 0; i <n; i++) { // row
            for (int j = 0; j <i; j++) { //col
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
