/*
Spiral
Step One :-
        make  1 1 1 1
              1 2 2 2
              1 2 3 3
              1 2 3 4

    Solution :=    Math.min(i,j);   of Square of n=4

Step Two :-
        make         3 2 1
             1 1 1 1 1 1 1
             1 2 2 2 2 2 1
             1 2 3 3 3 2 1
             1 2 3 4 3 2 1
      3      1 2 3 3 3 2 1
      2      1 2 2 2 2 2 1
      1      1 1 1 1 1 1 1

    Solution := Treat last three row and colum  as 3 2 1

                for(int i =1; i<=2*n-1; i++){
                    for(int j=1; j<=2*n-1; j++){
                        int a =i, b=j;
                        if(i>n) a = 2*n-i;
                        if(j>n) b = 2*n-j;
                        System.out.print(Math.min(a,b) + " ");
                    }
                }



 Step Three :-
            make 4 4 4 4 4 4 4
                 4 3 3 3 3 3 4
                 4 3 2 2 2 3 4
                 4 3 2 1 2 3 4
                 4 3 2 2 2 3 4
                 4 3 3 3 3 3 4
                 4 4 4 4 4 4 4

           Below the ans
*/




package Pattern_Printing.StanderdParrten;

public class Spiral {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <=2*n-1 ; i++) {
            for (int j = 1; j <=2*n-1 ; j++) {
                int a=i, b = j;
                if(i > n) a = n*2-i;
                if(j > n) b = n*2-j;
                System.out.print(n+1 - Math.min(a,b) + " ");
            }
            System.out.println();
        }
    }
}
