package Pattern_Printing.CompositeParttens;

public class PiramidUsingExtraVariable {
    public static void main(String[] args) {
        int n =4;

        int nos = n-1;  //starting value
        int nost = 1;  //starting value

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=nos; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j <nost; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();

            nos--;       //after each iteration
            nost += 2;   //after each iteration

        }
    }

}
