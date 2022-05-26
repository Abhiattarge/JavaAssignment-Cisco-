package arrayListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
class Emp1{
	int id;
	String name;
	float sal;
	
	public Emp1() {}
	public Emp1(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
}
class Emp2{
	int id;
	String name;
	float sal;
	
	public Emp2() {}
	public Emp2(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return "[id:"+id+", name:"+name+", sal:"+sal+"]";
	}
}
public class ArrayListExample21To28{

	public static void main(String[] args) {
		// 21. convert collection to array
		ArrayList<String> names = new ArrayList<String>();
		names.add("Phatechand");
		names.add("Anand");
		names.add("Sangita");
		
		System.out.println("ArrayList names: "+names);
		Object[] str = names.toArray();
		System.out.println("Array str : "+Arrays.toString(str));
		
		System.out.println("-----------------------------");
		// 22. swap two elements in ArrayList
		System.out.println("before swapping names: "+names);
		String temp = names.get(0);
		names.set(0,names.get(names.size()-1));
		names.set(names.size()-1, temp);
		System.out.println("after swapping names: "+names);
		
		System.out.println("-----------------------------");
		// 23. replace second element with specified element
		System.out.println("before replace names: "+names);
		names.set(1, "Lisa");
		System.out.println("after replace names: "+names);
		
		System.out.println("-----------------------------");
		// 24. create Emp(id, name, sal) without toString()
		// create ArrayList<Emp> and add two objects then display 
		ArrayList<Emp1> emps1 = new ArrayList<Emp1>();
		emps1.add(new Emp1(101, "Phatechand", 30000));
		emps1.add(new Emp1(102, "Sangita", 25000));
		System.out.println(emps1);
		
		System.out.println("-----------------------------");
		// 25. display with toString() override
		ArrayList<Emp2> emps2 = new ArrayList<Emp2>();
		emps2.add(new Emp2(101, "Phatechand", 30000));
		emps2.add(new Emp2(102, "Sangita", 25000));
		System.out.println(emps2);
		
		System.out.println("-----------------------------");
		// 26. print Emp whose sal > 10000
		System.out.println("employees whose sal > 10000");
		for(int i=0; i<emps2.size(); i++) {
			if(emps2.get(i).sal>10000)
				System.out.println(emps2.get(i));
		}
		
		System.out.println("-----------------------------");
		// 27. print Emp who have name Sachin
		System.out.println("employee with name sachin");
		int count = 0;
		for(int i=0; i<emps2.size(); i++) {
			if("Sachin".equals(emps2.get(i).name)) {
				System.out.println(emps2.get(i));
				count++;
			}
		}
		if(count==0)
			System.out.println("no employee having name Sachin");
		
		System.out.println("-----------------------------");
		// 28. print employee with max salary
		float maxSal = Integer.MIN_VALUE;
		for(Emp2 e: emps2) {
			if(e.sal>maxSal)
				maxSal = e.sal;
		}
		System.out.println("employees having highest salary i.e Rs."+maxSal);
		for(Emp2 e: emps2) {
			if(e.sal==maxSal)
				System.out.println(e);
		}
	}

}