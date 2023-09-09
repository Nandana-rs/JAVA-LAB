//program to list the sub-directories and files in a given directory and also search fora file name

import java.io.*;

public class co6q1 {
public static void main(String[] args) {
	
File f = new File("../../../");

String[] fileList = f.list();

for(String str : fileList) {
System.out.println(str);
}

FilenameFilter filter = new FilenameFilter() {
	
public boolean accept (File dir, String name) {

return name.startsWith("A");
}
};

//String[] children = f.list(filter);
//if (children == null) {
//System.out.println("Either dir does not exist or is not a directory");
//} 
//else {	
//for (int i = 0; i< children.length; i++) {
//String filename = children[i];
//ystem.out.println(filename);
//}
//}
}
}