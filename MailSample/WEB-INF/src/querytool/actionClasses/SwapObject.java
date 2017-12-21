package querytool.actionClasses;

public class SwapObject {
	public static void Swap(String s1,String s2){
		System.out.println(s1);
		System.out.println(s2);
		String temp= s1;
		s1=s2;
		s2= temp;
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public static void main(String[] args){
		String s1 = "you";
		String s2 ="me";
		Swap(s1,s2);
		System.out.println(s1);
		System.out.println(s2);
	}
	

}
