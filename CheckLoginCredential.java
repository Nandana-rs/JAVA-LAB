import java.util.*;
class UsernameException extends Exception
{
	public UsernameException(String msg)
	{
		super(msg);
	}
}
class PasswordException extends Exception
{
	public PasswordException(String msg)
	{
		super(msg);
	}
}
public class CheckLoginCredential
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String username,password;
	System.out.println("Enter username:");
	username=sc.nextLine();
	System.out.println("Enter password:");
	password=sc.nextLine();
	int length=username.length();
	try
	{
	if(length<6)
	throw new UsernameException("Username must be greater than 6 characters???");
	else if(!password.equals("hello"))
	throw new PasswordException("Incorrect password\nType correct password???");
	else
	System.out.println("Login Successfully");
	}
	catch(UsernameException u)
	{
	u.printStackTrace();
	}
	catch(PasswordException p)
	{
	p.printStackTrace();
	}
	finally
	{
	System.out.println("The finally statement is executed");
	}
	}
	}