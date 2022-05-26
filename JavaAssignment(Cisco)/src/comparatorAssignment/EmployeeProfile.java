package comparatorAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Profile{
	String state;
	String country;
	
	Profile(String state, String country){
		this.state = state;
		this.country = country;
	}
	
	public String toString() {
		return "[State : "+ state + ", Country : "+ country +"]";
	}
}
class Employee1 implements Comparable<Employee1>{
	int empId;
	String name;
	String designation;
	int age;
	Profile p;
	
	Employee1(int empId, String name, String designation, int age, Profile p){
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.p = p;
	}

	public String toString() {
		return "[ID : "+ empId + ", Name : " + name + ", designation : " +
				designation +", age : " + age + ", \n[Profile : " + p + "]";
	}
	
	public int compareTo(Employee1 e) {
		int n = this.p.country.compareTo(e.p.country);
		if(n<0)
			return -1;
		else if(n==0)
			return this.empId-e.empId;
		else
			return 1;
	}
	
}
public class EmployeeProfile {
	public static void dislpayEmployees(ArrayList<Employee1> emps) {
		Iterator<Employee1> itr = emps.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
		public static void main(String[] args) {
			ArrayList<Employee1> emps = new ArrayList<Employee1>();
			Profile usa = new Profile("California", "USA");
			Profile uk = new Profile("London", "UK");
			Profile ind = new Profile("Pune", "India");
			Profile uae = new Profile("Dubai", "UAE");
			emps.add(new Employee1(12783,"Akshya", "java developer", 26,usa));
			emps.add(new Employee1(12563,"Rishikesh", "associate java developer", 24,uk));
			emps.add(new Employee1(12456,"Vijaya", "trainee java developer", 22,ind));
			emps.add(new Employee1(12023,"Puja", "senior tester", 26,ind));
			emps.add(new Employee1(12782,"Sneha", "tester", 24,ind));
			emps.add(new Employee1(12893,"Abhisekh", "sdet", 25,usa));
			emps.add(new Employee1(12011,"Ankita", "manager", 32,uae));
			emps.add(new Employee1(12439, "Subhalaxmi", "UI developer", 24,uk));
			emps.add(new Employee1(12862, "Raj", "UI developer", 24,uk));
			emps.add(new Employee1(12012, "Puja", "test lead", 29,ind));
			emps.add(new Employee1(12423, "Vijaya", "developer lead", 28,uae));
			
			dislpayEmployees(emps);
			System.out.println("-----------------------------------------------------");
			Collections.sort(emps);
			dislpayEmployees(emps);
		
	}
		
}