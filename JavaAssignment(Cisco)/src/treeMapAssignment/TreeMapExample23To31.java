package treeMapAssignment;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample23To31 {

	public void showElements(SortedMap<Integer,String> nums) {
		Set<Map.Entry<Integer,String>> entryset = nums.entrySet();
		for(Map.Entry<Integer, String> entry : entryset) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		TreeMapExample23To31 obj = new  TreeMapExample23To31();
		TreeMap<Integer,String> nums = new TreeMap<Integer, String>();
		nums.put(12, "sita");
		nums.put(42, "gita");
		nums.put(25, "babita");
		nums.put(45, "sangita");
		nums.put(34, "ankita");
		nums.put(18, "namita");
		obj.showElements(nums);
		
		System.out.println("------------------------------");
		// 14. portion of a map whose keys are strictly less than given key
		System.out.println("portion of a map whose keys are strictly less than 25");
		SortedMap<Integer,String> submap1 = nums.headMap(25);
		obj.showElements(submap1);
		
		System.out.println("------------------------------");
		// 15. portion of a map whose keys are less than or equal to given key
		System.out.println("portion of a map whose keys are less than or equal to 25");
		SortedMap<Integer,String> submap2 = nums.headMap(25,true);
		obj.showElements(submap2);
		
		System.out.println("------------------------------");
		// 16. get least key strictly greater than the given key
		System.out.println("least key, which is  strictly greater than 25");
		System.out.println(nums.higherKey(25));
		
		System.out.println("------------------------------");
		// 17. get a key-value mapping associated with greatest key 
		// strictly greater than the given key
		System.out.println("least entry of key, which is  strictly greater than 25");
		System.out.println(nums.higherEntry(25));
		
		System.out.println("------------------------------");
		// 18. get the greatest key strictly less than given key
		System.out.println("greatest key strictly less than 25");
		System.out.println(nums.lowerKey(25));
		
		System.out.println("------------------------------");
		// 17. get a key-value mapping associated with greatest key 
		// strictly less than the given key
		System.out.println("greatest entry of key, which is  strictly less than 25");
		System.out.println(nums.lowerEntry(25));
		
		System.out.println("------------------------------");
		// 18. get portion of map whose keys range from(inclusive) 
		// and to another key(exclusive)
		System.out.println("portion of map 25(inclusive)- 45(exclusive)");
		SortedMap<Integer,String> submap3 = nums.subMap(25, true, 45, false);
		obj.showElements(submap3);
		
		System.out.println("------------------------------");
		// 19. get portion of map whose keys range from given key to another key
		System.out.println("portion of map from 25 to 45");
		SortedMap<Integer,String> submap4 = nums.subMap(25, 45);
		obj.showElements(submap4);
		
		System.out.println("------------------------------");
		// 20. get portion of map whose keys are greater than or equal to given key
		System.out.println("portion of map from 25(inclusive)");
		SortedMap<Integer,String> submap5 = nums.tailMap(25);
		obj.showElements(submap5);
		
		System.out.println("------------------------------");
		// 21. get portion of map whose keys are greater than to given key
		System.out.println("portion of map from 25");
		SortedMap<Integer,String> submap6 = nums.tailMap(25,false);
		obj.showElements(submap6);
		
		

	}

}