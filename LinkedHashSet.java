import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet{
    public static void main(String[] args) {
        // Step 1: Create a LinkedHashSet object
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Step 2: Add elements to the set
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Mango");

        // Step 3: Display the elements
        System.out.println("LinkedHashSet elements:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}
