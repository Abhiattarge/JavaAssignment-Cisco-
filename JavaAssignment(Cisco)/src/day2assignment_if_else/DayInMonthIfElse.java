package day2assignment_if_else;

import java.util.Scanner;

public class DayInMonthIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number fron 1 to 12 : ");
		month=sc.nextInt();
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			System.out.println("\n 31 Days in this month");
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			System.out.println("\n 30 Days in this month");
		}
		else if(month == 2)
		{
			System.out.println("\n Either 28 or 29 Days in this month");
		}
		else
		{
			System.out.println("\n Please enter valid month");
		}

	}

}
