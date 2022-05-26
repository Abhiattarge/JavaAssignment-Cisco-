package linkedListAssignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample01To10 {
	
	public static int getLastOccurence(LinkedList<Integer> nums,int num) {
		int f = getFirstOccurence(nums, num);
		if(f==-1)
			return f;
		int l = 0;
		for(int i=nums.size()-1; i>0; i++) {
			if(nums.get(i)==num) {
				l=i;
				break;
			}
		}
		return (f!=l)? l:-1;
	}
	public static int getFirstOccurence(LinkedList<Integer> nums,int num) {
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i)==num) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// 1. add specified element at last
		LinkedList<Integer> nums = new LinkedList<Integer>();
		nums.add(12);
		nums.add(23);
		System.out.println("nums: "+nums);
		nums.addLast(34);
		System.out.println("after adding 34 at last: "+nums);
		
		System.out.println("--------------------------------");
		// 2. iterate through all elements
		System.out.println("iterate through all elements");
		Iterator<Integer> itr = nums.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------");
		// 3. iterate through all elements starting at specified position
		System.out.println("all elements from position 2");
		ListIterator<Integer> litr = nums.listIterator(1);
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("--------------------------------");
		// 4. iterate a linked list in reverse order
		System.out.println("all elements in reverse order");
		Iterator<Integer> itr1 = nums.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("--------------------------------");
		// 5. insert at specified position
		System.out.println("nums: "+nums);
		System.out.println("after insert 25 at position 2");
		nums.add(1, 25);
		System.out.println("nums: "+nums);
		
		System.out.println("--------------------------------");
		// 6. insert at first and last position
		System.out.println("nums: "+nums);
		System.out.println("after insert 55 at first position");
		nums.addFirst(55);
		System.out.println("nums: "+nums);
		System.out.println("after insert 99 at las position");
		nums.addLast(99);
		System.out.println("nums: "+nums);
		
		
		System.out.println("--------------------------------");
		// 7. insert specified element at front
		System.out.println("nums: "+nums);
		System.out.println("after insert 76 at front");
		nums.addFirst(76);
		System.out.println("nums: "+nums);
		
		System.out.println("--------------------------------");
		// 8. insert specified element at end
		System.out.println("nums: "+nums);
		System.out.println("after insert 45 at end");
		nums.addLast(45);
		System.out.println("nums: "+nums);
		
		System.out.println("--------------------------------");
		// 9. insert some elements at specified position
		LinkedList<Integer> num1 = new LinkedList<Integer>();
		num1.add(87);
		num1.add(45);
		System.out.println("nums: "+nums);
		System.out.println("num1: "+num1);
		System.out.println("after adding num1 in nums at 2 position");
		nums.addAll(1, num1);
		System.out.println("nums: "+nums);
		
		System.out.println("--------------------------------");
		// 10. get first and last occurrence of specified element
		int f = getFirstOccurence(nums,45);
		System.out.println(f==-1? "45 not present":" first ouurs at index "+f);
		int l = getLastOccurence(nums,45);
		System.out.println(l==-1? "45 not present":" last ouurs at index "+l);
		
	}

}