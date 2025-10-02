package Strings_Stringbuilders;

import java.util.Scanner;

public class practiceAlphabet {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String s = sc.next();

        int[] arr = new int[26];
        //0-a, 1-b .. 25 - z

        for (int i = 0; i <s.length(); i++) {

            char ch = s.charAt(i);
            int idx = (int)ch - 97;
            arr[idx]++;

            // arr[(int)s.chatAt(i) - 97]
        }

        int max = -1;
        for (int i = 0; i <arr.length; i++) {
            if( max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == max){
                char ch = (char)(i+97);
                System.out.print(ch+" ");
            }
        }
    }
}
