 import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot perform pop operation.");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping elements from the stack
        int poppedItem1 = stack.pop();
        int poppedItem2 = stack.pop();

        System.out.println("Popped items: " + poppedItem1 + ", " + poppedItem2);
        System.out.println("Stack size: " + stack.size());
    }
}
