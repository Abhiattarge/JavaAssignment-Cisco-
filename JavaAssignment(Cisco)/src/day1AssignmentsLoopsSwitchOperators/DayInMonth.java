package day1AssignmentsLoopsSwitchOperators;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {
		// write a java program to print day of month name using switch case.
		
		Scanner sc = new Scanner(System.in);
		
		int number_of_DaysInMonth = 0;
		String MonthOfName = "Invalid";
		
		System.out.println("Enter the month number : ");
		int month = sc.nextInt();
		
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		switch(month)
		{
		case 1:
			MonthOfName = " january";
			number_of_DaysInMonth = 31;
			break;
		case 2:
			MonthOfName = " February";
			if((year % 400 == 0) || (year % 4 == 0)&&(year % 100 != 0))
			{
				number_of_DaysInMonth = 29;
			}
			else
			{
				number_of_DaysInMonth = 28;
			}
			
			break;
		case 3:
			MonthOfName = " March";
			number_of_DaysInMonth = 31;
			break;
		case 4:
			MonthOfName = " April";
			number_of_DaysInMonth = 30;
			break;
		case 5:
			MonthOfName = " May";
			number_of_DaysInMonth = 31;
			break;
		case 6:
			MonthOfName = " June";
			number_of_DaysInMonth = 30;
			break;
		case 7:
			MonthOfName = " July";
			number_of_DaysInMonth = 31;
			break;
		case 8:
			MonthOfName = " August ";
			number_of_DaysInMonth = 31;
			break;
		case 9:
			MonthOfName = " Sptember";
			number_of_DaysInMonth = 30;
			break;
		case 10:
			MonthOfName = " Ocomber";
			number_of_DaysInMonth = 31;
			break;
		case 11:
			MonthOfName = "November";
			number_of_DaysInMonth = 30;
			break;
		case 12:
			MonthOfName = " December";
			number_of_DaysInMonth = 31;
			break;
		default:
			System.out.println("Invalid Month Number.");
		}
		System.out.println(MonthOfName+" "+year+" Has "+number_of_DaysInMonth);
	}

}
