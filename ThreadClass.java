import java.util.*;
class MulTable extends Thread
{
	public void run()
	{
		int num=5;
		System.out.println("Multiplication Table of 5");
		for(int i=1;i<=10;++i)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}
class PrimeNo extends Thread
{
	public void run()
	{
		int i,j,flag;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int N=s.nextInt();
		System.out.println("The prime no is:");
		for(i=1;i<=N;i++)
		{
			if(i==1||i==0)
			continue;
			flag=1;
			for(j=2;j<=i/2;++j)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			System.out.println(i+"");
		}
	}
}
public class ThreadClass 
{
	public static void main(String args[])throws InterruptedException
	{
		MulTable m=new MulTable();
		m.start();
		m.sleep(3000);
		PrimeNo p=new PrimeNo();
		p.start();
		p.sleep(1000);
	}
}