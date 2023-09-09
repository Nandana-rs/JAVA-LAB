import java.util.LinkedList;

public class RemoveAllFromLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("Mango");

        // Display the original list
        System.out.println("Original LinkedList:");
        System.out.println(linkedList);

        // Remove all elements from the LinkedList
        linkedList.clear();

        // Display the list after removal
        System.out.println("\nLinkedList after removing all elements:");
        System.out.println(linkedList);
    }
}
