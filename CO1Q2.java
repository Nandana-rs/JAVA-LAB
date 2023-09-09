import java.util.Scanner;
 public class CO1Q2 {
	                                                    //matrix addition
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int i,j;
		 System.out.println("Enter the row of the matrix:");
		 int row = sc.nextInt();
		 System.out.println("Enter the column of the matrix:");
		 int col = sc.nextInt();
		 
		 int arr1[][]=new int[row][col];
		 System.out.println("enter elements of Matrix_1");
		 
		 for(i=0;i<row;i++)
		 {
			 for(j=0;j<col;j++)
			 {
				 arr1[i][j] = sc.nextInt();
			 }
		 }
		 System.out.println("Matrix_1 is:");
		 
		 for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		int arr2[][] = new int[row][col];
		
		System.out.println("Enter Matrix_2 Elements ");
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr2[i][j] = sc.nextInt();
			}	
		}
		System.out.println("Matrix_2 Elements are: ");
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		int arr3[][] = new int[row][col];
		
		System.out.println("Addition of Matrix_1 & Matrix_2 is: ");
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}	
		}
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
		 
		 
		 
	 
 
		 