import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListExample {
public static void main(String[] args) {
		
		//Creating ArrayList object
		List<String> arrayList = new ArrayList<String>();
		
		//Add data to ArrayList object
		arrayList.add("Zara");
		arrayList.add("ttt");
		arrayList.add("Zara");
		
		//Display ArrayList data
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + arrayList);

		//Creating LinkedList object
		List<String> LinkedList = new LinkedList<String>();
		
		//Add data to LinkedList
		LinkedList.add("Zara");
		LinkedList.add("Mahnaz");
		LinkedList.add("Ayan");
		
		//Display LinkedList data
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + LinkedList);

	}

}
