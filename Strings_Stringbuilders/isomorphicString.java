//LEETCODE 205
// Given two String s and t determine if they are isomorphic


/*
    class Solution {
    public boolean isIsomorphic(String s, String t) {
         char[] crr = new char[128];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch;
            if(crr[idx] == '\0'){
                crr[idx] = dh;
            }else{
                if(crr[idx] != dh) return false;
            }
        }
        for(int i=0; i<128;i++){
            crr[i] = '\0';
        }
        for(int i=0; i<t.length(); i++){
            char dh = t.charAt(i);
            char ch = s.charAt(i);
            int idx = (int)dh;
            if(crr[idx] == '\0'){
                crr[idx] = ch;
            }else{
                if(crr[idx] != ch) return false;
            }
        }
        return true;
    }
}
*/



package Strings_Stringbuilders;

import java.util.Scanner;

public class isomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = sc.next();
        char[] crr = new char[128];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = s2.charAt(i);
            int idx = (int)ch;
            if(crr[idx] == '\0'){
                crr[idx] = dh;
            }else{
                if(crr[idx] != dh) return;
            }
        }
        for(int i=0; i<128;i++){
            crr[i] = '\0';
        }
        for(int i=0; i<s2.length(); i++){
            char dh = s2.charAt(i);
            char ch = s.charAt(i);
            int idx = (int)dh;
            if(crr[idx] == '\0'){
                crr[idx] = ch;
            }else{
                if(crr[idx] != ch) return;
            }
        }
        sc.close();

    }
}
