package assignmentConstructor_20_April;

import java.util.Scanner;

public class EmployeeInformation {

	public static Employee e1;
	public static Dept d1;
	public static MyDate mydate1;
	public static Employee createEmployee() {
		
		Scanner sc = new Scanner(System.in);
		e1=new Employee();
		d1=new Dept();
		mydate1=new MyDate();
		
		System.out.println("Enter Employee Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter Employee id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee Salary : ");
		float salary=sc.nextFloat();
		
		System.out.println("Enter Dept Id : ");
		int dept_id=sc.nextInt();
		
		System.out.println("Enter Dept Name : ");
		String dept_name=sc.nextLine();
//		sc.nextLine();
		System.out.println("Enter Date :");
		int date=sc.nextInt();
		
		System.out.println("Enter Month :");
		int month=sc.nextInt();
		
		System.out.println("Enter year :");
		int year=sc.nextInt();
		
		
		e1.setName(name);
		e1.setId(id);
		e1.setSalary(salary);
		d1.setDept_Id(dept_id);
		d1.setDept_name(dept_name);
		mydate1.setDate(date);
		mydate1.setMonth(month);
		mydate1.setYear(year);
		e1.setDept(d1);
		e1.setMyDate(mydate1);
		return e1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		e1=EmployeeInformation.createEmployee();
		System.out.println("Employee Name:"+e1.getname());
		System.out.println("Employee id  :"+e1.getId());
		System.out.println("Employee Salary:"+e1.getSalary());
		System.out.println("Department id :"+d1.getDept_Id());
		System.out.println("Department Name :"+d1.getDept_name());
		System.out.println("Employee Date :"+mydate1.getDate());
		System.out.println("Employee Month :"+mydate1.getMonth());
		System.out.println("Employee Year :"+mydate1.getYear());
		

	}


}
