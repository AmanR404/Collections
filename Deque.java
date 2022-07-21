import java.util.*;

// ArrayDeque

public class Deque {
    
    public static void main(String[] args) {
        ArrayDeque<Integer> mydq = new ArrayDeque<>();

        mydq.add(6);
        mydq.add(86);
        mydq.add(71);
        mydq.addFirst(1);

        mydq.remove(6);

        mydq.contains(71);

        System.out.println(mydq.getLast());
        System.out.println(mydq.getFirst());

    }

    // All methods are same as previous.
   

    

}
