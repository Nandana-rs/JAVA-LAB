//program to copy one file to another-

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class co6q3 {
public static void main(String[] args) throws IOException{
	
	

FileInputStream fileinput = new FileInputStream("source.txt");
FileOutputStream fileoutput = new FileOutputStream("destination.txt");

int i;
while((i = fileinput.read()) != -1)
{
	fileoutput.write(i);
}
System.out.println("copied");

fileinput.close();
fileoutput.close();
}
}
