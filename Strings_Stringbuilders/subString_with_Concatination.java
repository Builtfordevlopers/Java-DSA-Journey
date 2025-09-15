package Strings_Stringbuilders;

public class subString_with_Concatination {

    public static void main(String[] args) {

        // Wrong way change value of string

        String s = "hello";
        //heylo
        //2nd index change to y

        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
