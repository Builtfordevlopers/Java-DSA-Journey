/*
    Question:-
        Input a String and Update all the even positions in the
        string to character 'a'. Consider 0-based indexing. using Extra String

     observation:-
        poor performance between of immutability

      Method:-
          Stupid
*/

package Strings_Stringbuilders;

public class Update_evenPositionString {
    public static void main(String[] args) {
        String s = "dipak";
        String str = "";
        for (int i = 0; i <s.length(); i++) {
            if(i%2==0){
                str += 'a';
            }else {
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }
}
