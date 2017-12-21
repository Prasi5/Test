package querytool.actionClasses;

/**
 * 
 * @author scii359
 *
 */
public class A6 implements printable {
	public void print(){System.out.println("Hello");}  
	  
	public static void main(String args[]){  
	A6 obj = new A6();  
	obj.print(); 
	obj.hashCode();
	System.out.println(obj.hashCode());
}  

}
