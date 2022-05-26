package treeMapAssignment;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample10To22 {

	public static void main(String[] args) {
		// 1. create tree map which contains integer
		TreeMap<Integer,String> tmap1 = new TreeMap<Integer, String>();
		tmap1.put(24, "D");
		tmap1.put(42, "C");
		tmap1.put(12, "A");
		tmap1.put(45, "B");
		System.out.println("tmap1 : "+tmap1);
		
		System.out.println("-------------------------------------");
		// 2. create tree map which contains string
		TreeMap<String,Integer> folder = new TreeMap<String,Integer>();
		folder.put("oops", 177);
		folder.put("array", 84);
		folder.put("collecton", 56);
		folder.put("string", 100);
		folder.put("exception",45);
		System.out.println("folders : "+folder);
		
		System.out.println("-------------------------------------");
		// 3. search a key in map
		System.out.print("does any folder with name string: ");
		System.out.println(folder.containsKey("string")? " Yes its there": " Not present");
		
		System.out.println("-------------------------------------");
		// 4. search a value in map
		System.out.println("does A present in tmap1 :");
		System.out.println(tmap1.containsValue("A")? "A is present":" Not present");
		
		System.out.println("-------------------------------------");
		// 5. get all keys from map
		System.out.println("folders : "+folder);
		System.out.println("all keys from folder");
		Set<String> keyset = folder.keySet();
		for(String key : keyset) {
			System.out.println(key);
		}
		
		System.out.println("-------------------------------------");
		// 6. delete all elements
		System.out.println("tmap1 : "+tmap1);
		tmap1.clear();
		System.out.println("after delete all elements");
		System.out.println("tmap1 : "+tmap1);
		
		System.out.println("-------------------------------------");
		// 7. copy one tree map to other
		System.out.println("folder : "+folder);
		TreeMap<String,Integer> folderCopy = new TreeMap<>(folder);
		System.out.println("folderCopy : "+folderCopy);
		
		System.out.println("-------------------------------------");
		// 8. sort keys by using comparator
		TreeMap<String,Integer> descFolder = new TreeMap<>(Collections.reverseOrder());
		descFolder.put("oops", 177);
		descFolder.put("array", 84);
		descFolder.put("collecton", 56);
		descFolder.put("string", 100);
		descFolder.put("exception",45);
		System.out.println("folders in descending on name");
		System.out.println(descFolder);
		
		System.out.println("-------------------------------------");
		// 9. create map with integer key and print greatest and lowest entry
		TreeMap<Integer,String> emps = new TreeMap<Integer, String>();
		emps.put(2515, "Sangita");
		emps.put(2512, "Ankita");
		emps.put(2522, "Anupama");
		emps.put(2545, "Sambit");
		emps.put(2502, "Ankit");
		System.out.println("employee ID-Name : ");
		System.out.println(emps);
		Integer highestKey = emps.lastKey();
		System.out.println("highest entry : "+highestKey+" "+emps.get(highestKey));
		Integer lowestKey = emps.firstKey();
		System.out.println("lowest entry : "+lowestKey+" "+emps.get(lowestKey));
		
		System.out.println("-------------------------------------");
		// 10. get first key and last key currently in tree map
		System.out.println("first key : "+emps.firstKey());
		System.out.println("last key : "+emps.lastKey());
		
		System.out.println("-------------------------------------");
		// 11. reverse order view of tree map
		System.out.println("employee in reverse order");
		NavigableMap<Integer, String> reverse = emps.descendingMap();
		Set<Map.Entry<Integer,String>> entryset = reverse.entrySet();
		for(Map.Entry<Integer,String> entry : entryset) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("-------------------------------------");
		// 12. key-value associated with greatest key less than or equals to given key
		System.out.println(emps.ceilingEntry(2522));
		
		System.out.println("-------------------------------------");
		// 13. greatest key less than or equals to given key
		System.out.println(emps.ceilingKey(2522));
		
		

	}

}