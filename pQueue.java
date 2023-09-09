import java.util.*;
public class pQueue {
public static void main(String[] args) {
PriorityQueue <Integer> pq = new PriorityQueue<>();
pq.add(10);
pq.add(13);
pq.add(15);
System.out.println("Elements are:");
System.out.println(pq);
System.out.println("Peek element is:");
System.out.println(pq.peek());
System.out.println("Removed element:");
System.out.println(pq.poll());
System.out.println("New peek element:");
System.out.println(pq.peek());
}
}