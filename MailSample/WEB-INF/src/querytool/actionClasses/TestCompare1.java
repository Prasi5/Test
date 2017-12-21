package querytool.actionClasses;

public class TestCompare1 {
	public static void main(String[] args){
	String s1 ="abc";
	String s2= "ABC";
	String s3=new String("abc");  
	String s4="Saurav";  
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	}
}
