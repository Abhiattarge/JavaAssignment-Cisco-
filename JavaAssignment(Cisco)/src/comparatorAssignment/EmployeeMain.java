package comparatorAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class SortEmployeeByNameAsc implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int n = e1.name.compareTo(e2.name);
		if(n<0)
			return -1;
		else if(n==0)
			return e1.empId-e2.empId;
		else
			return 1;
	}
}
class Employee implements Comparable<Employee>{
	int empId;
	String name;
	String designation;
	int age;
	
	Employee(int empId, String name, String designation, int age){
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

	public String toString() {
		return "[ID : "+ empId + ", Name : " + name + ", designation : " +
				designation +", age : " + age + "]";
	}
	
	public int compareTo(Employee e) {
		if(this.empId<e.empId)
			return -1;
		else if(this.empId==e.empId)
			return 0;
		else
			return 1;
	}
	
}
public class EmployeeMain {
	
	public static void displayEmployees(ArrayList<Employee> emps) {
		Iterator<Employee> itr = emps.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(12783,"Akshya", "java developer", 26));
		emps.add(new Employee(12563,"Rishikesh", "associate java developer", 24));
		emps.add(new Employee(12456,"Vijaya", "trainee java developer", 22));
		emps.add(new Employee(12023,"Puja", "senior tester", 26));
		emps.add(new Employee(12782,"Sneha", "tester", 24));
		emps.add(new Employee(12893,"Abhisekh", "sdet", 25));
		emps.add(new Employee(12011,"Ankita", "manager", 32));
		displayEmployees(emps);
		System.out.println("----------------------------------------------------");
		Collections.sort(emps);
		displayEmployees(emps);
		System.out.println("----------------------------------------------------");
		Collections.sort(emps, Collections.reverseOrder());
		displayEmployees(emps);
		System.out.println("----------------------------------------------------");
		emps.add(new Employee(12439, "Subhalaxmi", "UI developer", 24));
		emps.add(new Employee(12862, "Raj", "UI developer", 24));
		emps.add(new Employee(12012, "Puja", "test lead", 29));
		emps.add(new Employee(12423, "Vijaya", "developer lead", 28));
		Collections.sort(emps,new SortEmployeeByNameAsc());
		displayEmployees(emps);
	}

}