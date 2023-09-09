//program to write to a file, then read from the file and display the contents on the console


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class co6q2 {
public static void main(String[] args) {
	
try {
	
FileWriter w = new FileWriter("java_write.txt",true);
w.write("new file is created");
w.close();

FileReader reader = new FileReader("java_write.txt");

BufferedReader br= new BufferedReader(reader);

String line;

System.out.println("Data read from the file");
while ((line = br.readLine()) != null) {
System.out.println(line);
}
reader.close();

} catch (IOException e) {
System.out.println("-----Error-----");
}
}
}