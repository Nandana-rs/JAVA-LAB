import java.util.*;
interface Proto
{
	void area();
	void peri();
}
class Rectangle implements Proto
{	int l,b,a,p;
	public void area()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle : ");
		l = in.nextInt();
		b = in.nextInt();
		a=l*b;
		System.out.println("Area of rectangle : "+a);
	}
	public void peri()
	{
		p=2*(l+b);
		System.out.println("Perimeter of rectangle : "+p);
	}
}
class Circle implements Proto
{	
	float r,a,p;
	public void area()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		r = in.nextFloat();
		a=3.14f*(r*r);
		System.out.println("Area of circle : "+a);
	}
	public void peri()
	{
		p=(2*3.14f)*r;
		System.out.println("Perimeter of circle : "+p);
	}	
}
public class shapearea
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int op=1;
		do
		{
			System.out.println(" Select any of the following shapes to calculate area and perimeter : ");
			System.out.println(" 1. Circle ");
			System.out.println(" 2. Rectangle ");
			System.out.println(" 3. Exit ");
			int ch=in.nextInt();
			switch(ch)
			{
				case 1 :Circle c = new Circle();
						c.area();
						c.peri();
						break;
				case 2 :Rectangle r = new Rectangle();
						r.area();
						r.peri();
						break;
				case 3 :System.exit(0);
						break;
				default : System.out.println("Invalid choice ");
			}
		}
		while(op!=0);
	}
}
