import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class  {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 15);

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);

        // Convert HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}
