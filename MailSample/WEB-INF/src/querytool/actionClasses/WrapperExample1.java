package querytool.actionClasses;

public class WrapperExample1 {
	public static void main(String[]args){
	int a = 20;
	Integer i = new Integer(a);// auto-boxing converting int to Integer 
	Integer j = a;
	System.out.print(a+" "+i+" "+j);  
	

	}
}