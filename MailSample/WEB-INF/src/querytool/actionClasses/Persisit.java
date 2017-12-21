package querytool.actionClasses;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Persisit {

	public static void main(String args[])throws Exception{  
		  Student s1 =new Student(); 
		  FileOutputStream fout=new FileOutputStream("D:/f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.flush();  
		  System.out.println("success");  
		 }  

}
class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a=10;
	String b="fyggf";
}