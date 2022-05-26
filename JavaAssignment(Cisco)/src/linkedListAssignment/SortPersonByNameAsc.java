  package linkedListAssignment;

import java.util.Comparator;

public class SortPersonByNameAsc implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}
}
class SortPersonByWeightDesc implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		return (int)(p2.weight-p1.weight);
	}
}