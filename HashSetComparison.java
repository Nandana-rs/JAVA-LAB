import java.util.HashSet;
import java.util.Set;

public class HashSetComparison {
    public static void main(String[] args) {
        // Create the first HashSet
        Set<String> set1 = new HashSet<>();
		
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        // Create the second HashSet
        Set<String> set2 = new HashSet<>();
		
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Orange");

        // Compare the two sets
        boolean isEqual = set1.equals(set2);

        // Display the result
        System.out.println("HashSet 1: " + set1);
        System.out.println("HashSet 2: " + set2);
        System.out.println("HashSet 1 and HashSet 2 are equal: " + isEqual);
    }
}

