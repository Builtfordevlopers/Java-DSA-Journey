package Pattern_Printing;

import java.util.Scanner;

public class NumberSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4; //row
        //colum printing
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        //row printing
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
