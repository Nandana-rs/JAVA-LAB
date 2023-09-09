import java.util.*;

public class arraylist{
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
		
        arrayList.add("Ryan");
        arrayList.add("Zera");
        arrayList.add("Lily");
        arrayList.add("Andrea");
        System.out.println("The elements of the arraylist is - "+arrayList);
        
        Collections.sort(arrayList);
        System.out.println("\nThe ArrayList Sort : "+arrayList); 
		
        Collections.addAll(arrayList,"Riya","Hope","Natalie","Vishnu","Selena");
        System.out.println("\nAdding new items in the arraylist is : "+arrayList);  
		
        Collections.sort(arrayList, Collections.reverseOrder()); 
        System.out.println("\nThe reverse order of the arraylist : "+arrayList);
        System.out.println("\nThe maximum element of the arraylist : "+Collections.max(arrayList));
    }
}
