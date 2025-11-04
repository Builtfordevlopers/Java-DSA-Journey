/*
Expected Output

1
0 1
1 0 1
0 1 0 1

*/

package Pattern_Printing.Special2_Pattern;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int n= 4;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2==1){
                    if(j%2==1){
                        System.out.print(1 + " ");
                    }else {
                        System.out.print(0 + " ");
                    }
                }else {
                    //if(i%2==0){  FOR UNDERSTANDING
                        if(j%2==0){
                            System.out.print(1 + " ");
                        }else {
                            System.out.print(0 + " ");
                        }
                   // }
                }
            }
            System.out.println();
        }
    }
}
