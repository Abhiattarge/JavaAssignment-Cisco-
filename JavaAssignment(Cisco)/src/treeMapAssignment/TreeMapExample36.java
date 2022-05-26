package treeMapAssignment;

import java.util.TreeMap;

public class TreeMapExample36 {

	public static void main(String[] args) {
		TreeMap<String,Float> weights = new TreeMap<String,Float>();
		weights.put("A", 58.5f);
		weights.put("B", 62.32f);
		weights.put("C", 60.45f);
		weights.put("D", 63f);
		System.out.println(weights);
		System.out.println(weights.firstKey());
		System.out.println(weights.firstEntry());
		System.out.println(weights.lastKey());
		System.out.println(weights.lastEntry());
		System.out.println(weights.lowerKey("C"));
		System.out.println(weights.higherKey("C"));
		System.out.println(weights.floorKey("C"));
		System.out.println(weights.headMap("C"));
		System.out.println(weights.tailMap("C"));
		System.out.println(weights.subMap("A", "C"));

	}

}