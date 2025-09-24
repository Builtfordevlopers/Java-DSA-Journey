package Strings_Stringbuilders;

import java.util.Scanner;

public class QESTION {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        for (int j = 0; j < t; j++) {
            int n = sc.nextInt(); // read length (but we won’t use it)
            String input = sc.next().trim(); // read DNA string

            StringBuilder str = new StringBuilder(input);

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'A') str.setCharAt(i, 'T');
                else if (ch == 'T') str.setCharAt(i, 'A');
                else if (ch == 'C') str.setCharAt(i, 'G');
                else if (ch == 'G') str.setCharAt(i, 'C');
            }

            System.out.println(str);
        }


    }
}
