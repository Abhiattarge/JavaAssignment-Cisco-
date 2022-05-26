package assignmentConstructor_20_April;

import java.util.Scanner;

public class Persondata {
	public static Address a1;
	public static Person p1;
	public static Person createPerson() {
		
		Scanner sc = new Scanner(System.in);
		p1=new Person();
		a1=new Address();
		System.out.println("Enter City Name: ");
		String city=sc.nextLine();
		
		System.out.println("Enter State Name: ");
		String state=sc.nextLine();
		
		System.out.println("Enter Country Name : ");
		String country=sc.nextLine();
		
		System.out.println("Enter the Person Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter the Person Gender :");
		String gender=sc.nextLine();
		
		System.out.println("Enter the Person Age :");
		int age=sc.nextInt();
		
		
		a1.setCity(city);
		a1.setState(state);
		a1.setCountry(country);
		p1.setName(name);
		p1.setAge(age);
		p1.setGender(gender);
		p1.setAddress(a1);
		return p1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1=Persondata.createPerson();
		System.out.println("Address City :"+a1.getCity());
		System.out.println("Address State :"+a1.getState());
		System.out.println("Address Country :"+a1.getCountry());
		System.out.println("Person Name :"+p1.getname());
		System.out.println("Person Age :"+p1.getAge());
		System.out.println("Person Gender :"+p1.getGender());
		

	}

}
