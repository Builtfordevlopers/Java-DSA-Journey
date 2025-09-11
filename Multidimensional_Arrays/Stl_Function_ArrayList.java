/*
    Basic STL function in ArrayList

    objective:-
        TO learn hwo to print 2D ArrayList and how to declare and initialize
        STL functions like add(), get(), remove(), size(), clear(), isEmpty(), etc

    Learning:-
        What is List?
            List is an interface in Java (in the java.util package).
            It defines a contract (rules) for ordered collections:
            Elements are stored in order (like an array).
            Elements can be duplicated.
            You can access elements using indexes (list.get(i)).
            It does not decide how the list is implemented.

        *   The reference type is List, but the object type is ArrayList.


        way to Declare 1D ArrayList
            1) ArrayList<Integer> v = new ArrayList<>();
            2) List<Integer> v = new ArrayList<>();   //preferred

        way to Declare 2D ArrayList
            1) ArrayList<ArrayList<Integer>> v = new ArrayList<>();
            2) List<ArrayList<Integer>> v = new ArrayList<>();    //empty arrayList which can store 1D arrayList
            3) List<List<Integer>> v = new ArrayList<>();  //preferred

        Basic STL Operations
            list.add(10);          // add element at end
            list.add(1, 20);       // add element at index 1
            list.get(0);           // get element at index 0
            list.set(0, 99);       // update element at index 0
            list.remove(1);        // remove element at index 1
            list.size();           // number of elements
            list.isEmpty();        // check if list is empty
            list.contains(20);     // check if element exists
            list.clear();          // remove all elements

        So in summary:-
            Here, the reference type is List, but the object type is ArrayList.
            List = Interface (rules for all lists).
            ArrayList, LinkedList, Vector = Implementations.
            Best practice: always declare as List<>, initialize with ArrayList<>.
*/

package Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Stl_Function_ArrayList {
    public static void main(String[] args) {

        //1D Array
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);
        List<Integer> c = new ArrayList<>();
        c.add(50); c.add(60);

        //2D Array
        List<List<Integer>> v = new ArrayList<>();
        v.add(a); v.add(b); v.add(c);

        // Printing 2D Array Method 1

        for (int i = 0; i <v.size(); i++) {
            List<Integer> x = v.get(i);
            for (int j = 0; j <x.size(); j++) {
                System.out.print(x.get(j));
            }
            System.out.println();
        }

        //Printing 2D Array Method 2 (preferred)
        for (int i = 0; i <v.size(); i++) {
            for (int j = 0; j <v.get(i).size(); j++) {
                System.out.print(v.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
