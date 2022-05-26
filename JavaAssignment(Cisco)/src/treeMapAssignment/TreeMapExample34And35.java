package treeMapAssignment;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

class Employee{
	int empId;
	String empName;
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	public String toString() {
		return "[ "+ empId + ", "+ empName + " ]";
	}
}
public class TreeMapExample34And35 {

	public static void main(String[] args) {
		TreeMap<Integer,Employee> emps = new TreeMap<>(Collections.reverseOrder());
		Employee e1 = new Employee(12, "sita");
		emps.put(e1.empId, e1);
		Employee e2 = new Employee(42, "gita");
		emps.put(e2.empId, e2);
		Employee e3 = new Employee(25, "babita");
		emps.put(e3.empId, e3);
		Employee e4 = new Employee(45, "sangita");
		emps.put(e4.empId, e4);
		Employee e5 = new Employee(34, "ankita");
		emps.put(e5.empId, e5);
		Employee e6 = new Employee(18, "namita");
		emps.put(e6.empId, e6);
		System.out.println("employees in descending order of id");
		Collection<Employee> values = emps.values();
		for(Employee e : values) {
			System.out.println(e);
		}
		System.out.println("-------------------------");
		System.out.println("employees in ascending order of id");
		Set<Integer> keyset = emps.descendingKeySet();
		for(Integer key : keyset) {
			System.out.println(emps.get(key));
		}

	}

}