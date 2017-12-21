package querytool.actionClasses;

public class Gc {
	public static void main(String[] args){
		String s= new String("RR");
		s= null;
		System.gc();
		System.out.println("hi");
	}
	public void finalize(){
		System.out.println("overridden");
	}
}
