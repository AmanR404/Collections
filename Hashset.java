import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        
        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(81);


        myHashSet.remove(8);

        System.out.println(myHashSet);

    }
}
