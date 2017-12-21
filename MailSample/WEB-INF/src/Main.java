import java.util.Iterator;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add(1);
		map.add(5);
		map.add(4);
		map.add(0);
		map.add(2);
		map.add(3);
		Iterator it = map.iterator();
		while (it.hasNext() ) {
			System.out.println(it.next() + " ");
		}
		}
	}
