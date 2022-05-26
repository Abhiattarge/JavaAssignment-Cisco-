package linkedListAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample20To26 {
	
	public static boolean compare2LinkedList(LinkedList<Integer> num1, 
				LinkedList<Integer> num2) {
		int l1 = num1.size();
		int l2 = num2.size();
		if(l1!=l2)
			return false;
		for(int i=0; i<l1; i++) {
			if(num1.get(i)!=num2.get(i))
				return false;
		}
		return true;
		
	}
	public static void checkIselementPresent(LinkedList<Integer> nums, int num) {
		Iterator<Integer> itr = nums.iterator();
		while(itr.hasNext()) {
			if(itr.next()==num) {
				System.out.println(num+" is present");
				return;
			}
		}
		System.out.println(num+" is not present");
	}
	public static void main(String[] args) {
		// 21. retrieve last element but doesn't remove
		LinkedList<Integer> marks = new LinkedList<Integer>();
		marks.add(75);
		marks.add(95);
		marks.add(86);
		marks.add(92);
		marks.add(78);
		System.out.println(marks);
		System.out.println("last element : "+marks.getLast());
		
		System.out.println("---------------------------------");
		// 22. check if a particular element exist in the linked list
		System.out.println(marks);
		checkIselementPresent(marks,75);
		
		System.out.println("---------------------------------");
		// 23. convert linked list to array list
		System.out.println("linked list marks : "+marks);
		ArrayList<Integer> al = new ArrayList<>(marks);
		System.out.println("array list al : "+al);
		
		System.out.println("---------------------------------");
		// 24. compare two linked list
		LinkedList<Integer> nums = new LinkedList<Integer>();
		nums.add(12);
		nums.add(23);
		nums.add(35);
		System.out.println(marks);
		System.out.println(nums);
		boolean flag = compare2LinkedList(marks,nums);
		System.out.println(flag?"both are equal":"both are different");
		
		System.out.println("---------------------------------");
		// 25. check a linked list is empty or not
		System.out.println("nums : "+nums);
		System.out.print("does ll nums is empty : ");
		System.out.println(nums.isEmpty()?"Yes":"No");
		
		System.out.println("---------------------------------");
		// 26. replace an element in linked list
		System.out.println(marks);
		System.out.println("replace 86 with 83");
		marks.set(marks.indexOf(86), 83);
		System.out.println(marks);
	}

}