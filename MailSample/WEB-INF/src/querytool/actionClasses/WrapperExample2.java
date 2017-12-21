package querytool.actionClasses;

public class WrapperExample2 {
	public static void main(String[] args){
		int i = 6;// String s1 = i.toString(); doest work becoz i is not ob
	Integer a = new Integer(3);
	int b = a.intValue();// converting Integer to primitive type(int) 
	String s = a.toString();
	
	System.out.println(a+" "+b+" "+s);
	}
}
