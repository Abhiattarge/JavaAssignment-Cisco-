package comparatorAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortInteger {

	public static void main(String[] args) {
		ArrayList<Integer> runs = new ArrayList<Integer>();
		runs.add(23);
		runs.add(45);
		runs.add(8);
		runs.add(72);
		runs.add(12);
		runs.add(22);
		System.out.println(runs);
		Collections.sort(runs);
		System.out.println(runs);

	}
}