package querytool.actionClasses;

public class SwapObject2 {
	public static void main(String[] args)
    {
         Foo f = new Foo("f");
         System.out.println(f);
         changeReference(f); // It won't change the reference!
         modifyReference(f); // It will change the object that the reference refers to!
    }
    public static void changeReference(Foo a)
    {
    	System.out.println(a);
         Foo b = new Foo("b");
         a = b;
         System.out.println(a);
    }
    public static void modifyReference(Foo c)
    {
    	System.out.println(c);
         c.setAttribute("c");
         System.out.println(c);
    }

}
class Foo{

	public Foo(String s1) {
		// TODO Auto-generated constructor stub
	}

	public void setAttribute(String s1) {
		// TODO Auto-generated method stub
		
	}
	
}