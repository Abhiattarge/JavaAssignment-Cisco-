package assignmentArrayOfObject;

public class Employee {
	int id;
	String name;
	int salary;
	
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// wap to create Array of Employee and display the employee data by traversing array.
		// Employee class id,name,salary.
		
		 Employee e1 = new  Employee(123,"Abhi",28000);
		 Employee e2 = new  Employee(124,"Raj",25000);
		 Employee e3 = new  Employee(125,"Yogesh",30000);
		 Employee e4 = new  Employee(126,"Vijay",35000);
		 
		 Employee[] arr= {e1,e2,e3,e4};
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].salary);
		 }
		 

	}

}
