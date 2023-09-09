import java.util.Scanner;
public class CO1Q1 {
	int pcode;
	String pname;
	int price;
	
public void get() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the pcode:");
	pcode = sc.nextInt();
	System.out.println("Enter the pname:");
	pname = sc.next();
	System.out.println("enter price:");
	price = sc.nextInt();

}

public void put() {
	System.out.println("product code is :"+ pcode);
	System.out.println("product name is :"+ pname);
	System.out.println("product price  is :"+price);
}

public static void main(String args[]) {
	CO1Q1 p1 = new CO1Q1();
   CO1Q1 p2 = new CO1Q1();
   CO1Q1 p3 = new CO1Q1();
   
   p1.get();
   p2.get();
   p3.get();
   
   p1.put();
   p2.put();
   p3.put();
   
   if(p1.price <p2.price&&p1.price<p3.price)
   {   
	   System.out.println("p1 is the lowest price");
	   
   }
   else if(p2.price <p1.price&&p2.price<p3.price)
   {
	   System.out.println("p2 is the lowest price");
   }
   else 
   {
	   System.out.println("p3 is the lowest price");
   }
}
}