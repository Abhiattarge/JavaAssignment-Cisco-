package comparatorAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class SortStudentByRollnoAsc implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.rollno-s2.rollno;
	}
}
class SortStudentByNameAsc implements Comparator<Student>{
public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
class SortStudentByAgeAsc implements Comparator<Student>{
public int compare(Student s1, Student s2) {
		return s1.age-s2.age;
	}
}
class Student{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "[Roll No : "+ rollno + ", Name : "+ name + ", Age : "+ age + "]";
	}
}
public class StudentMain {
	
	public static void displayStudentsDetail(ArrayList<Student> slist) {
		Iterator<Student> itr = slist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(12439, "Subhalaxmi", 24));
		slist.add(new Student(12425, "Shree", 25));
		slist.add(new Student(12432, "Bishnupriya", 22));
		slist.add(new Student(12435, "Haripriya", 28));
		
		displayStudentsDetail(slist);
		System.out.println("-----------------------------------------------------");
		Collections.sort(slist, new SortStudentByRollnoAsc());
		displayStudentsDetail(slist);
		System.out.println("-----------------------------------------------------");
		Collections.sort(slist, new SortStudentByNameAsc());
		displayStudentsDetail(slist);
		System.out.println("-----------------------------------------------------");
		Collections.sort(slist, new SortStudentByAgeAsc());
		displayStudentsDetail(slist);

	}

}
