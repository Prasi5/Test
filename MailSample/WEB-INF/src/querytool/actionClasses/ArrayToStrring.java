package querytool.actionClasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayToStrring {
	public static void main(String[] args) {
		List<String> al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		System.out.println(al.size());
		String[] stringArrayObject = new String[al.size()];
		 al.toArray(stringArrayObject);
		 for(String temp : stringArrayObject)
			    System.out.println(temp);
	}

}