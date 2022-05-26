package day4assignment;

public class LogicalOperator {

	public static void main(String[] args) {
		// 4. Logical Operator
		
		//&& op
		System.out.println((5 > 3) && (8 > 5));
		
		System.out.println((5 > 3) && (8 < 5));
		
		// || op
		System.out.println((5 < 3) || (8 > 5));
		
		System.out.println((5 > 3) || (8 < 5));
		
		System.out.println((5 < 3) || (8 < 5));
		
		//! op
		System.out.println(!(5 == 3));
		
		System.out.println(!(5 > 3));

	}

}
