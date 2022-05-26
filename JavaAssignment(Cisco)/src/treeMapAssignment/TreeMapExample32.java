package treeMapAssignment;

import java.util.Set;
import java.util.TreeMap;

class Student implements Comparable<Student>{
	int rollNo;
	String name;
	int mark;
	Student(int rollNo, String name, int mark){
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
	public String toString() {
		return "[RollNo : "+ rollNo + ", Name : "+ name + ", Mark : " + mark+ "]";
	}
	public int compareTo(Student s) {
		if(s.mark<this.mark)
			return -1;
		else if(s.mark==this.mark) {
			int c = this.name.compareTo(s.name);
			return (c==0)? this.rollNo-s.rollNo: c;
		}
		else 
			return 1;
	}
}
class Teacher{
	String name;
	Teacher(String name){
		this.name = name;
	}
}
public class TreeMapExample32 {

	public static void main(String[] args) {
		TreeMap<Student,Teacher> tmap = new TreeMap<Student, Teacher>();
		tmap.put(new Student(1201, "Amol", 85), new Teacher("Kirti"));
		tmap.put(new Student(1202, "Ankita", 90), new Teacher("Kalyani"));
		tmap.put(new Student(1203, "Amol", 85), new Teacher("Kirti"));
		
		Set<Student> students = tmap.keySet();
		for(Student s: students) {
			System.out.println(s);
		}

	}

}