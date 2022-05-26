package arrayListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleUpto10 {
	
	public static void printArrayList(ArrayList l) {
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// 1. ArrayList without generic
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(23);
		al.add(63);
		al.add(29);
		al.add(48);
		
		printArrayList(al);
		
		ArrayList str = new ArrayList();
		str.add("sky");
		str.add("looks");
		str.add("blue");
		str.add("in");
		str.add("color");
		
		printArrayList(str);
		
		System.out.println("_____________________________");
		// 2. both Integer and String
		ArrayList mix = new ArrayList();
		mix.add(0, 123);
		mix.add(1, "hello");
		
		System.out.println(mix.get(0));
		System.out.println(mix.get(1));
		
		System.out.println("_____________________________");
		// 3. add method example
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(78);
		marks.add(85);
		marks.add(96);
		marks.add(83);
		marks.add(75);
		
		printArrayList(marks);
		
		System.out.println("_____________________________");
		// 4. print using iterator
		System.out.println("display marks using iterator");
		Iterator<Integer> itr = marks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 5. iterate using for loop
		int sum = 0;
		for(int i=0; i<marks.size(); i++) {
			sum+=marks.get(i);
		}
		System.out.println("total mark using for loop : "+sum);
		
		// 6. iterate using for each
		sum = 0;
		for(int x : marks) {
			sum+=x;
		}
		System.out.println("total mark using for each : "+sum);
		
		System.out.println("_____________________________");
		// 7. create, add elements, print
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("violet");
		colors.add("indigo");
		colors.add("blue");
		colors.add("green");
		colors.add("yellow");
		colors.add("orange");
		colors.add("red");
		
		System.out.println("rainbow colors : ");
		printArrayList(colors);
		System.out.println("_____________________________");
		// 8. remove element
		colors.remove(1);
		colors.remove("red");
		System.out.println("after remove elements : ");
		System.out.println("rainbow colors : ");
		printArrayList(colors);
		
		System.out.println("_____________________________");
		// 9. remove all elements
		colors.removeAll(str);
		System.out.println("after remove all : ");
		System.out.println("rainbow colors : ");
		printArrayList(colors);
		
		System.out.println("_____________________________");
		// 10. retain all elements
		colors.retainAll(str);
		System.out.println("after retain all : ");
		printArrayList(colors);

	}

}
