/*
    Question:-
        Reverse each word in a given sentence.
*/
package Strings_Stringbuilders;

import java.util.Scanner;

public class ReverseQuestionBuilder {

    public static void reverse(StringBuilder sb, int i, int j){
        while(i<=j){

            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j, temp);

//            char frontChar = sb.charAt(i);
//            char backChar = sb.charAt(j);
//
//            sb.setCharAt(i, backChar);
//            sb.setCharAt(j, frontChar);

            i++;
            j--;
        }
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int i=0; int j= 0;
        while(j < n){
            if(sb.charAt(j) != ' ') j++;
            else {
                reverse(sb, i,j-1);
                i = j+1;
                j = i;
            }
        }
        reverse(sb, i,j-1);
        System.out.println(sb);
        sc.close();
    }
}
