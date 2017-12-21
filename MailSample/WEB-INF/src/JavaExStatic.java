public class JavaExStatic {
	private static String str = "BeginnersBook";
	 static class MyNestedClass{
		 public void disp() {
			 System.out.println(str);
		 }
	 }
	 public static void main(String args[])
	   {
		 JavaExStatic.MyNestedClass obj = new JavaExStatic.MyNestedClass();
		 obj.disp();
		 
	   }
}
