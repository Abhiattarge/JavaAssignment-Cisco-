package linkedListAssignment;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample10To20 {
	
	public static void displayElementsAndPosition(LinkedList<Integer> nums) {
		for(int i=0; i<nums.size(); i++) {
			System.out.println("elements "+nums.get(i)+" presrnt at pos "+i);
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		nums.add(12);
		nums.add(32);
		nums.add(45);
		nums.add(62);
		nums.add(10);
		
		// 11. display elements with position
		displayElementsAndPosition(nums);
		
		System.out.println("------------------------------------------------");
		// 12. remove a specified element
		System.out.println("remove 62");
		System.out.println(nums);
		nums.remove(nums.indexOf(62));
		System.out.println(nums);
		
		System.out.println("------------------------------------------------");
		// 13. remove first and last element
		System.out.println("remove first element");
		System.out.println(nums);
		nums.removeFirst();
		System.out.println(nums);
		System.out.println("remove last element");
		System.out.println(nums);
		nums.removeLast();
		System.out.println(nums);
		
		System.out.println("------------------------------------------------");
		// 14. remove all elements
		System.out.println("remove all elements");
		System.out.println(nums);
		nums.clear();
		System.out.println(nums);
		
		System.out.println("------------------------------------------------");
		// 15. swap two elements in linked list
		nums.add(10);
		nums.add(32);
		nums.add(20);
		nums.add(45);
		nums.add(25);
		System.out.println(nums);
		System.out.println(" swap 10 and 45");
		Collections.swap(nums, 0, 3);
		System.out.println(nums);
		
		System.out.println("------------------------------------------------");
		// 16. shuffle elements in linked list
		System.out.println(nums);
		System.out.println("after shuffling elements are ..");
		Collections.shuffle(nums);
		System.out.println(nums);
		
		System.out.println("------------------------------------------------");
		// 17. join two linked list
		LinkedList<Integer> nos = new LinkedList<Integer>();
		nos.add(75);
		nos.add(55);
		nos.add(56);
		nos.add(42);
		System.out.println("nums : "+nums);
		System.out.println("nos : "+nos);
		System.out.println("nums join nos");
		nums.addAll(nos);
		System.out.println(nums);
		
		System.out.println("------------------------------------------------");
		// 18. clone one linked list to another
		System.out.println(nos);
		@SuppressWarnings("unchecked")
		LinkedList<Integer> nosClone = (LinkedList<Integer>)nos.clone();
		System.out.println(nosClone);
		
		System.out.println("------------------------------------------------");
		// 19. remove and return first element
		System.out.println(nos);
		Integer fe = nos.removeFirst();
		System.out.println(fe+" got removed");
		System.out.println(nos);
		
		System.out.println("------------------------------------------------");
		// 20. retrieve but does not remove first element
		System.out.println(nos);
		System.out.println("first element : "+nos.getFirst());
		
	}

}