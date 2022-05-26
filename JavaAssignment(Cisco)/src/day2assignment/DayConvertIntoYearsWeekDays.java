package day2assignment;

import java.util.Scanner;

public class DayConvertIntoYearsWeekDays {

	public static void main(String[] args) {
		// write a java program to convert day into years , weeks, days.
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the days::\n");
		
		int d = in.nextInt();
		int y;
		int w;
		
		// d= days
		// y = years
		// w = weeks
		
		y = (d /365);
		w = (d % 365)/7;
		d = d -((y * 365) +(w));
		
		System.out.println("\n"+y+"years"+w+"weeks, and"+d+"days");
	}

}
