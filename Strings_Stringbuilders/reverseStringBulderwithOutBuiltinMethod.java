/*
    Take input a StringBuilder reverse it without using Builtin Method
*/

package Strings_Stringbuilders;

public class reverseStringBulderwithOutBuiltinMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("dipakSir");

        int i = 0;
        int j = sb.length() - 1;

        while(i < j){


            //Swap
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(j);

            sb.setCharAt(i, backChar);
            sb.setCharAt(j, frontChar);


            i++;
            j--;
        }

        System.out.println(sb);
    }
}
