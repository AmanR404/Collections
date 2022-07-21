import java.lang.reflect.Array;
import java.util.*;

public class Arraylist{
    public static void main(String[] args) {
        
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> values2 = new ArrayList<>();

        values.add(6);
        values.add(5);
        values.add(3);
        values.add(0,1);

        values2.add(15);
        values2.add(18);
        values2.add(25);

        values.addAll(values2);                          /* To add all elements of VALUES2 in VALUES1 */

        values.set(1, 7);
        values2.isEmpty();                               /* To check whether List is empty or not */

        values.remove(0);

        // System.out.println(values.get(1));

        System.out.println(values.contains(35));

        for (int i = 0; i<values.size(); i++){
            System.out.println(values.get(i));
        }
    }
}

// Arraylist and Linkedlist are the same only u have to change the name to create Linkedlist......
// addlast() & getLast()... are the some methods which are introduced in Linkedlist.