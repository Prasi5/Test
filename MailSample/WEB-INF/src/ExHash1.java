import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;


public class ExHash1 {
	public static void main(String[] args) {
		/*HashMap<Integer, String> map = new HashMap<Integer, String>();
		Hashtable<Integer, String> source = new Hashtable<Integer,String>();
		map.put(23,"twentythree");
		map.put(22, "Twentytwo");
		map.put(21, "twentyone");
		map.put(24, "Twentyfour");
		HashMap<Integer, String> subMap = new HashMap<Integer, String>();
		 subMap.put(25, "Twentyfive");
	     subMap.put(26, "Twentysix");
	     map.putAll(subMap);
	     System.out.println(map);// copy the contents to another map
	     
		Iterator<Integer> keySetIterator = map.keySet().iterator();
		while(keySetIterator.hasNext()){
			Integer key = keySetIterator.next();
			System.out.println("key: " + key + " value: " + map.get(key));// using iterator to iterate the values
			}
		System.out.println(map.size());// to know the size of map
		
		System.out.println("Does HashMap contains 21 as key: " + map.containsKey(21));// to know wheather the kep is present in map 
		
		boolean isEmpty = map.isEmpty(); 
		System.out.println("Is HashMap is empty: " + isEmpty);// to check for empty
		
		Integer key = 21; 
		Object value = map.remove(key); // to remove key in map 
		System.out.println("Following value is removed from Map: " + value);
		map.clear();
		
		TreeMap<Integer,String> sortedHashMap = new TreeMap<Integer,String>(map);   
		System.out.println("Sorted HashMap: " + sortedHashMap); // to sort the values in map we use treemap
		
		
*/		
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		Iterator<String> it = myMap.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			if(key.equals("3")) myMap.put(key+"new", "new3");
		
		}
		System.out.println("ConcurrentHashMap after iterator: "+myMap);
	}

}
