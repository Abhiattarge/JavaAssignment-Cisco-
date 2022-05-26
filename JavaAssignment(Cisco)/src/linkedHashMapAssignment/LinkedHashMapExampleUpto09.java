package linkedHashMapAssignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
class Contact{
	long mobNo;
	String email;
	Contact(long mobNo, String email){
		this.mobNo = mobNo;
		this.email = email;
	}
	public String toString() {
		return "[ "+ mobNo + ", " + email + "]";
	}
}
public class LinkedHashMapExampleUpto09 {
	
	public void printStudents(LinkedHashMap<Integer,String> map) {
		Set<Map.Entry<Integer, String>> entryset = map.entrySet();
		for(Map.Entry<Integer,String> entry : entryset) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}
	public void printItems(LinkedHashMap<String,Float> bill) {
		Set<Map.Entry<String, Float>> items = bill.entrySet();
		for(Map.Entry<String, Float> item : items) {
			System.out.println(item.getKey()+"   Rs. "+item.getValue());
		}
	}
	public static void main(String[] args) {
		LinkedHashMapExampleUpto09 obj = new LinkedHashMapExampleUpto09();
		// 1. create linked hash map with integer and string 
		// without using generic
		LinkedHashMap map1 = new LinkedHashMap<>();
		map1.put(1, "one");
		map1.put(2, "two");
		map1.put(3, "three");
		map1.put(4, "four");
		System.out.println(map1);

		System.out.println("------------------------------");
		// 2. create linked hash map with string and integer
		// without using generic 
		LinkedHashMap map2 = new LinkedHashMap();
		map2.put("Apple", 120);
		map2.put("Grape", 80);
		map2.put("Banana", 60);
		map2.put("Guava", 40);
		System.out.println(map2);

		System.out.println("------------------------------");
		// 3. create linked hash map with string and custom type
		LinkedHashMap<String,Contact> contacts = new LinkedHashMap<String, Contact>();
		contacts.put("Office", new Contact(9178455362l, "anand@thinksoft.com"));
		contacts.put("home", new Contact(9938762390l, "anand@gmail.com"));
		contacts.put("relative", new Contact(9937652892l, "sagar12@gmail.com"));
		System.out.println(contacts);

		System.out.println("------------------------------");
		// 4. create linked hash map with integer and string use generic
		LinkedHashMap<Integer,String> map3 = new LinkedHashMap<>();
		map3.put(1, "once");
		map3.put(2, "twice");
		map3.put(3, "thrice");
		map3.put(4, "fourth");
		System.out.println(map3);

		System.out.println("------------------------------");
		// 5. create linked hash map with string and integer use generic
		LinkedHashMap<String,Integer> map4 = new LinkedHashMap<>();
		map4.put("Apple", 80);
		map4.put("grape", 80);
		map4.put("banana", 50);
		map4.put("guava", 30);
		System.out.println(map4); 
		
		System.out.println("------------------------------");
		// 6. create a linked hash map
		LinkedHashMap<String,Float> bill = new LinkedHashMap<String, Float>();
		bill.put("Jeans Pant", 2499.0f);
		bill.put("tshirt", 450.50f);
		bill.put("Shoe", 799.0f);
		bill.put("sun glass", 250f);
		bill.put("lipstick", 120.50f);
		bill.put("ear ring", 40f);
		bill.put("lehenga", 1749.75f);
		obj.printItems(bill);
		
		System.out.println("------------------------------");
		// 6.a) search a value in map
		System.out.print("does any item cost Rs. 5000.0 -");
		System.out.println(bill.containsValue(5000f)?" Yes": "No");
		
		System.out.println("------------------------------");
		// 6.b) get all keys in map
		System.out.println("all keys are");
		Set<String> keyset = bill.keySet();
		for(String key : keyset) {
			System.out.println(key);
		}
		
		System.out.println("------------------------------");
		// 6.c) remove an element from map
		obj.printItems(bill);
		bill.remove("sun glass");
		System.out.println("\nsun glass is removed\n");
		obj.printItems(bill);
		
		System.out.println("------------------------------");
		// 7. copy one hash map contents to another linked hash map
		HashMap<Integer,Integer> square = new LinkedHashMap<Integer, Integer>();
		square.put(1, 1);
		square.put(2, 4);
		square.put(3, 9);
		square.put(4, 16);
		square.put(5, 25);
		System.out.println("hash map-square: ");
		System.out.println(square);
		LinkedHashMap<Integer,Integer> squareCopy = new LinkedHashMap<>(square);
		System.out.println("linked hash map-squareCopy");
		System.out.println(squareCopy);
		
		System.out.println("------------------------------");
		// 8. delete all elements from linked hash map
		System.out.println("after delete all elements from squareCopy");
		squareCopy.clear();
		System.out.println(squareCopy);
		
		System.out.println("------------------------------");
		// 9. highest key entry and lowest key entry
		LinkedHashMap<Integer,String> students = new LinkedHashMap<Integer, String>();
		students.put(4512, "john");
		students.put(4523, "jenny");
		students.put(4505, "tom");
		students.put(4511, "sara");
		students.put(4521, "emily");
		obj.printStudents(students);
		Set<Integer> rollnos = students.keySet();
		Integer rollno = Collections.max(rollnos);
		System.out.println("entry with highest key");
		System.out.println(rollno+" "+students.get(rollno));
		rollno = Collections.min(rollnos);
		System.out.println("entry with lowest key");
		System.out.println(rollno+" "+students.get(rollno));
		
		
		

	}

}
