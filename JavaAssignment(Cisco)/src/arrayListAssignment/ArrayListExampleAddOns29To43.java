package arrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleAddOns29To43 {
	
	public static void reverseArrayList(ArrayList<Integer> num) {
		int i=0, j=num.size()-1;
		int temp =0;
		while(i<j) {
			temp = num.get(i);
			num.set(i, num.get(j));
			num.set(j, temp);
			i++;
			j--;
		}
	}
	public static boolean checkEquals(ArrayList<String> al1, ArrayList<String> al2) {
		if(al1.size()!=al2.size())
			return false;
		for(int i=0; i<al1.size(); i++) {
			if(al1.get(i)!=al2.get(i)) {
				return false;
			}
		}
		return true;
	}
	public static void copyOneToOther(ArrayList<String> al1, ArrayList<String> al2) {
		if(!al2.isEmpty())
			al2.clear();
		for(int i=0; i<al1.size(); i++)
			al2.add(al1.get(i));
	}
	public static void sortArrayList(ArrayList<String> cities) {
		for(int i=0; i<cities.size();i++) {
			String key = cities.get(i);
			int j=i-1;
			while(j>=0 && key.compareTo(cities.get(j))<0) {
				cities.set(j+1, cities.get(j));
				j--;
			}
			cities.set(j+1,key);
		}
	}
	public static void main(String[] args) {
		// 29. use of addAll
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Pune");
		cities.add("Satara");
		cities.add("Nashik");
		cities.add("Nagpur");
		
		ArrayList<String> metro = new ArrayList<String>();
		metro.add("Mumbai");
		metro.add("Pune");
		metro.add("Nagpur");
		
		System.out.println("before addAll :");
		System.out.println("cities: "+cities);
		System.out.println("metro: "+metro);
		cities.addAll(metro);
		System.out.println("after addAll :");
		System.out.println("cities: "+cities);
		
		System.out.println("-------------------------------------------------");
		// 30. sort a given array list
		System.out.println("before sorting cities: ");
		System.out.println(cities);
		sortArrayList(cities);
		System.out.println("after sorting cities: ");
		System.out.println(cities);
		
		System.out.println("-------------------------------------------------");
		// 31. copy one array list to another
		ArrayList<String> metroCopy = new ArrayList<String>();
		System.out.println("before copying: "+metroCopy);
		copyOneToOther(metro,metroCopy); // metroCopy.addAll(metro);
		System.out.println("after copying : "+metroCopy);
		
		System.out.println("-------------------------------------------------");
		// 32. compare two array list print if equals?
		boolean isEqual = checkEquals(metro,metroCopy);
		System.out.println("does metro and metroCopy equals: "+(isEqual?"Yes":"No"));
		isEqual = checkEquals(metro, cities);
		System.out.println("does metro and cities equals: "+(isEqual?"Yes":"No"));
		
		System.out.println("-------------------------------------------------");
		// 33. join two array list
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(12);
		num1.add(23);
		num1.add(34);
		System.out.println("num1: "+num1);
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(45);
		num2.add(56);
		num2.add(67);
		System.out.println("num2: "+num2);
		ArrayList<Integer> num3 = new  ArrayList<Integer>();
		num3.addAll(num1);
		num3.addAll(num2);
		System.out.println("(num1 join num2)num3: "+num3);
		
		System.out.println("-------------------------------------------------");
		// 34. clone an array list to another
		
		System.out.println("-------------------------------------------------");
		// 35. empty array list
		System.out.println("before emptying: "+num3);
		num3.clear();
		System.out.println("after emptying: "+num3);
		
		System.out.println("-------------------------------------------------");
		// 36. trim the capacity of an array list to current list size
		
		System.out.println("-------------------------------------------------");
		// 37. increase size of an array list
		
		System.out.println("-------------------------------------------------");
		// 38. update array element with specified element
		System.out.println("num1: "+num1);
		System.out.println("after replace 12 with 21 :");
		num1.set(0, 21);
		System.out.println("num1: "+num1);
		
		System.out.println("-------------------------------------------------");
		// 39. remove third element
		System.out.println("num1: "+num1);
		System.out.println("after removed third element");
		num1.remove(2);
		System.out.println("num1: "+num1);
		
		System.out.println("-------------------------------------------------");
		// 40. shuffle elements in array list
		
		System.out.println("-------------------------------------------------");
		// 41. reverse array list elements
		System.out.println("before reverse num2: "+num2);
		reverseArrayList(num2); // Collections.reverse(num2);
		System.out.println("after reverse num2: "+num2);
		
		System.out.println("-------------------------------------------------");
		// 42. extract a portion of array list
		System.out.println("cities: "+cities);
		System.out.println("extract between pos 2 to 5");
		for(int pos=2; pos<=5; pos++) {
			System.out.println(cities.get(pos-1));
		}
		List<String> c = cities.subList(1,5);
		System.out.println(c);
		System.out.println("-------------------------------------------------");
		// 43. print all element using position
		System.out.println("metro elements with position");
		for(int pos=1; pos<=metro.size(); pos++) {
			System.out.println(pos+") "+metro.get(pos-1));
		}
	}

}