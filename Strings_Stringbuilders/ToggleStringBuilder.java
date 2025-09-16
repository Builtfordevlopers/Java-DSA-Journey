/*
    Input a String and toggle all the character of it.
    (Replace small case with capital case & vice versa)

    AScII
    A-65
    a-97

    a - A = 32
    b - B =32
    32

    n- N = 32;
*/

package Strings_Stringbuilders;

import java.util.Scanner;

public class ToggleStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for (int i = 0; i <sb.length(); i++) {

            char ch = sb.charAt(i);
            int ascii = (int)ch;

            if(ascii >=65 && ascii <=90){ //means Capital

                ascii += 32;
            } else if (ascii >= 97 && ascii <= 122) { //means small

                ascii -= 32;
            }
            ch = (char)ascii;
            sb.setCharAt(i,ch);

        }

        System.out.println(sb);
    }
}
