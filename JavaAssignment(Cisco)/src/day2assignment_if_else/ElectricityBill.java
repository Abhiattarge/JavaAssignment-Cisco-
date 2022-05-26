package day2assignment_if_else;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Units: ");
		int units=sc.nextInt();
		double bill=0;
		
		if(units<=50)
		{
			bill=units*0.5;
		}
		else if(units<=150)
		{
			bill=(units-50)*0.75;
		}
		else if(units<=250)
		{
			bill=(50*0.5)+(150*0.75)+((units-200)*1.20);
		}
		else
		{
			bill=(50*0.5)+(150*0.75)+(100*1.20)+((units-250)*1.50);
		}
		System.out.println("Total bill is : "+bill);

	}

}
