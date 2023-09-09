import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);

        // Display the initial map
        System.out.println("Initial Map: " + map);

        // Change the value of an existing key
        map.put("Apple", 5);

        // Display the map after changing the value
        System.out.println("Map after changing the value of 'Apple': " + map);

        // Remove an element from the map
        map.remove("Banana");

        // Display the map after removing an element
        System.out.println("Map after removing 'Banana': " + map);
    }
}
