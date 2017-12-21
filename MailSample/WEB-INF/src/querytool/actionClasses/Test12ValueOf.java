package querytool.actionClasses;

public class Test12ValueOf {
	public static void main (String[] args){
		  Float a = Float.valueOf(80);    //returns an Integer object holding the value of the specified primitive.    
		  Double d = Double.valueOf("444");//returns an Integer object holding the value of the specified string representation.
	      Integer b = Integer.valueOf("-4445235",10);// returns an Integer object holding the integer value of the specified string representation, parsed with the value of radix.
	      System.out.println(a);
	      System.out.println(b);
	      
	}
	

}
