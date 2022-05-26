package linkedListAssignment;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	int age;
	String name;
	float weight;

	public Person() {}

	public Person(int age, String name, float weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return "["+age+","+name+","+weight+"]\n";
	}
	
	public int compareTo(Person o) {
		if(this.age<o.age)
			return -1;
		else if(this.age==o.age) {
			return o.name.compareTo(this.name);
		}
		else
			return 1;
	}
	
}
public class PersonSorting {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person(25, "Phate", 78));
		people.add(new Person(23, "Uthit", 58));
		people.add(new Person(26, "Daya", 65));
		
		System.out.println(people);
		Collections.sort(people);
		System.out.println("after sorting ascending as age");
		System.out.println(people);
		
		Collections.sort(people, new SortPersonByWeightDesc());
		System.out.println("after sorting descending as weight");
		System.out.println(people);
		
		people.add(new Person(26, "Daya", 65));
		Collections.sort(people, new SortPersonByNameAsc());
		System.out.println("after sorting ascending as name");
		System.out.println(people);

	}

}