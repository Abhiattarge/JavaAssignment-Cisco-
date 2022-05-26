package comparatorAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {

	public static void main(String[] args) {
		ArrayList<String> sports = new ArrayList<String>();
		sports.add("cricket");
		sports.add("football");
		sports.add("badminton");
		sports.add("chess");
		System.out.println(sports);
		Collections.sort(sports);
		System.out.println(sports);

	}

}