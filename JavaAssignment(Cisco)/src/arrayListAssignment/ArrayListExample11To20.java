package arrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample11To20 {
	
	public static void printEvenNumbers(ArrayList<Integer> nums) {
		System.out.println("all even numbers between 1 to 50 ");
		Iterator<Integer> itr = nums.iterator();
		int n = 0;
		while(itr.hasNext()) {
			n = itr.next();
			if(n%2==0)
				System.out.print(n+" ");
		}
		System.out.println();
	}
	public static void printArrayList(ArrayList<String> l) {
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i)+", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// 11. know how many elements
		ArrayList<String> names = new ArrayList<String>();
		names.add("james");
		names.add("peeter");
		names.add("sarah");
		printArrayList(names);
		System.out.println("total no of names : "+names.size());
		
		System.out.println("-------------------------------");
		// 12. check array list is empty
		System.out.print("does arralist names is empty : ");
		System.out.println(names.isEmpty()?"yes":"no");
		
		System.out.println("-------------------------------");
		// 13. empty the array list
		names.clear();
		System.out.println("after emptying the array list");
		System.out.print("does arralist names is empty : ");
		System.out.println(names.isEmpty()?"yes":"no");
		
		System.out.println("-------------------------------");
		// 14. search an element
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Nashik");
		cities.add("Kolhapur");
		cities.add("Satara");
		printArrayList(cities);
		System.out.print("does Pune in list : ");
		System.out.println(cities.contains("Pune")?"yes":"No");
		
		System.out.println("-------------------------------");
		// 15. search the specified collection
		ArrayList<String> metro = new ArrayList<String>();
		metro.add("Mumbai");
		metro.add("Pune");
		System.out.print("metro cities : ");
		printArrayList(metro);
		System.out.print("does metro cities in list cities : ");
		System.out.println(cities.containsAll(names)?"yes":"No");
		
		System.out.println("-------------------------------");
		// 16. retrieve an element at specific index
		System.out.println("last city name : "+cities.get(cities.size()-1));
		
		System.out.println("-------------------------------");
		// 17. insert element at first position
		System.out.println("city names before insert : ");
		printArrayList(cities);
		cities.add(0, "Navi Mumbai");
		System.out.println("city names after insert at first position : ");
		printArrayList(cities);
		
		System.out.println("-------------------------------");
		// 18. add 1 to 50 numbers and print even number using iterator
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=1; i<=50; i++) {
			nums.add(i);
		}
		
		printEvenNumbers(nums);
		
		System.out.println("-------------------------------");
		// 19. match two collection
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(10);
		num1.add(20);
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(10);
		num2.add(20);
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		num3.add(10);
		num3.add(20);
		num3.add(30);
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("num3: "+num3);
		System.out.print("does num1 and num2 are equal: ");
		System.out.println(num1.containsAll(num2) && num2.containsAll(num1)?"Yes":"No");
		System.out.print("does num2 and num3 are equal: ");
		System.out.println(num2.containsAll(num3) && num3.containsAll(num2)?"Yes":"No");
		
		System.out.println("-------------------------------");
		// 20. check collection is empty
		System.out.println("num1: "+num1);
		System.out.print("does num1 is empty : ");
		System.out.println(num1.isEmpty()?"Yes":"No");

	}

}