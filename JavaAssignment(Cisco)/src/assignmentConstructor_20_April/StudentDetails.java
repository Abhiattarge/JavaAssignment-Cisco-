package assignmentConstructor_20_April;

import java.util.Scanner;

public class StudentDetails {
public static Department d1;
public static Student s1;
public static Student createStudent() {
	
	
	Scanner sc = new Scanner(System.in);
	s1=new Student();
	d1=new Department();
	System.out.println("Enter the Department Id: ");
	int did=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Department Name: ");
	String dname=sc.nextLine();
	System.out.println("Enter the Studet id : ");
	int sid=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Student Name : ");
	String sname=sc.nextLine();
	
	d1.setDid(did);
	d1.setDname(dname);
	s1.setSid(sid);
	s1.setSname(sname);
	s1.setDepartment(d1);
	return s1;
}


	public static void main(String[] args) {
		s1=StudentDetails.createStudent();
		System.out.println("Department id :"+d1.getDid());
		System.out.println("Department Name :"+d1.getDname());
		System.out.println("Student Id :"+s1.getSid());
		System.out.println("Student Name :"+s1.getSname());
		
	}

}
