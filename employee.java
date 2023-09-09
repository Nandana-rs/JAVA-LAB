import java.util.Scanner;
public class employee{
	int eno;
	String ename;
	int esalary;
		
public void get(){
Scanner sc=  new Scanner(System.in);
System.out.println("Enter the eno:");
eno=sc.nextInt();
System.out.println("Enter the ename:");
ename=sc.next();
System.out.println("Enter the esalary:");
esalary=sc.nextInt();
}

public void put(){
	System.out.println("Employee code is:"+eno);
	System.out.println("Employee name is:"+ename);
	System.out.println("Employee salary is:"+esalary);
} 


public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of employees");
	 int n=sc.nextInt();
	employee e[] = new employee[n];
	
	for(int i=0;i<n;i++)
	{
		e[i] = new employee();
		e[i].get();
	}
	for(int i=0;i<n;i++)
	{
		e[i].put();
	}
	System.out.println("Enter eno of employee for searching:");
	int value  = sc.nextInt();
	
	int flag=0;
	for(int i=0;i<n;i++)
	{
		if(e[i].eno==value)
		{
			flag=1;
			e[i].put();
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("not found");
	}
}
}
	
