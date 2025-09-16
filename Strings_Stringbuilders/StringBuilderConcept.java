/*
StringBuilder in Java is a mutable, or changeable, sequence of characters. It's designed to be a high-performance replacement for String when you need to perform many modifications, like concatenations or insertions, because String objects are immutable and creating new ones repeatedly is inefficient.

Why Do We Need StringBuilder? The Problem with String
To understand StringBuilder, you first need to understand that Java String objects are immutable. This means once a String object is created, it can never be changed.

When you think you are modifying a string, you are actually creating a brand new one.

Declaration and Initialization
    There are three primary ways to create a StringBuilder object using its constructors.

    1) StringBuilder sb1 = new StringBuilder();

    2) StringBuilder sb2 = new StringBuilder(50); // Capacity for 50 characters

    3)  String initialText = "Java is fun";
        StringBuilder sb3 = new StringBuilder(initialText);


Method	Description	Example

    append(data)	            Adds the data to the end of the sequence. Can append any type (String, int, char, etc.).	sb.append("!");
    insert(offset, data)	    Inserts data at the specified index (offset).	sb.insert(0, "Start: ");
    delete(start, end)	        Removes characters from the start index up to (but not including) the end index.	sb.delete(0, 4);
    deleteCharAt(index)	        Removes the character at a specific index.	sb.deleteCharAt(5);
    replace(start, end, str)	Replaces the characters from start to end-1 with the given str.	sb.replace(5, 10, "Java");
    reverse()	                Reverses the entire character sequence.	sb.reverse();
    length()	                Returns the number of characters currently in the StringBuilder.	int len = sb.length();
    capacity()	                Returns the total allocated capacity (how many characters it can hold before resizing).	int cap = sb.capacity();
    toString()	                Crucial Method: Converts the StringBuilder back into an immutable String object.	String finalString = sb.toString();
    charAt(index)	            Returns the char value at the specified index.	char c = sb.charAt(0);
    setCharAt(index, ch)	    Sets the character at the specified index to ch.	sb.setCharAt(0, 'H');
*/

package Strings_Stringbuilders;

import java.util.Scanner;

public class StringBuilderConcept {
    public static void main(String[] args) {

        //  Handling Input and Output

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");

        // 1. Read the input as a String
        String userInput = scanner.nextLine();

        // 2. Initialize a StringBuilder with the user's input
        StringBuilder sb = new StringBuilder(userInput);

        // 3. Now, you can modify it
        sb.append(" (processed)");
        sb.reverse();

        System.out.println("Modified text: " + sb.toString());

        StringBuilder report = new StringBuilder("Report Header\n");
        report.append("-------------\n");
        report.append("Data line 1.\n");

        // Direct printing (implicitly calls toString())
        System.out.println(report);

        // Explicit conversion to String
        String finalReport = report.toString();
        System.out.println("\nFinal String version:\n" + finalReport);
        scanner.close();

    }
}
