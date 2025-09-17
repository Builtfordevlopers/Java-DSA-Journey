/*
    Practice Functins of StingBuilder
*/

package Strings_Stringbuilders;

public class insertDelete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);

        // we give only index in
        //  deleteCharAt(index);

        sb.deleteCharAt(3);
        System.out.println(sb);

        sb.append("xyz");
        System.out.println(sb);  // abcefxyz

        sb.delete(2,4);
        System.out.println(sb); // abfxyz

        sb.setCharAt(2,'g');
        System.out.println(sb);

        sb.insert(2,'L');
        System.out.println(sb);

        //Reverse


    }
}
