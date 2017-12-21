import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;


public class ExArr {
	public static void main(String[] args) {
		 ArrayList<String> arr = new ArrayList<String>();
		 arr.add("flower");
		 arr.add("animal");
		 arr.add("table");
		 arr.add("chair");
		 Enumeration<String> e = Collections.enumeration(arr);
		  while(e.hasMoreElements())
		      System.out.println(e.nextElement());
		 
	}

}
