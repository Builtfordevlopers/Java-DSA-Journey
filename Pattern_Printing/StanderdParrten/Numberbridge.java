package Pattern_Printing.StanderdParrten;

public class Numberbridge {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n*2+1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <=n ; i++) {
            int a =1;
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(a++ +" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(" " +" ");
                a++;
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
