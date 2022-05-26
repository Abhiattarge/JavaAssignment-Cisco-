package day1assignmentLoops;

public class CountNumberOfDigitWhileLoop {

	public static void main(String[] args) {
		// count number of digits in any number.
		int count =0,num = 003452;
		
		while(num != 0)
		{
			num=num/10;
			++count;
		}
		System.out.println("Number of digits: "+count);

	}

}
