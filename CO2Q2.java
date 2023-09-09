import java.util.Scanner;
public class CO2Q2{
	                                             //search an element in an array
	public static void main(String args[]){
		Scanner s = new Scanner(System.in); 
		
	int i ;

		
		int arr[]=new int[5];
			System.out.println("enter the Elements are :");
		for(i=0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Elements are :");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");	
		}
		System.out.println("\nElement searching:");
		int val = s.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				System.out.println("value found");
				System.out.println("Position of element is :"+(i+1));
			}
		}
		
	}
}