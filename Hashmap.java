import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        
      HashMap<String, Integer> myHashMap = new HashMap<>();

      myHashMap.put("Aman", 10);
      myHashMap.put("Govind", 20);
      myHashMap.put("Ameen", 5);

      myHashMap.containsKey("Aman");
      myHashMap.containsValue(10);

     System.out.println( myHashMap.isEmpty());

    //  myHashMap.remove("Ameen");

    System.out.println(myHashMap.values());                              /* To return values present in Map */

      System.out.println(myHashMap.get("Govind"));

    //   myHashMap.clear();

      System.out.println(myHashMap);
    }
}
