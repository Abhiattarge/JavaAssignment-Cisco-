package day2assignment;

public class ompoundIntrest {

	public static void main(String[] args) {
		// write a java program to enter p, t, r and calculate compound intrest
		
		int p=2000;
		double r =0.08;
		int n=12;
		int t=5;
		double ci;
		ci=(p*(1+r/n)*(n*t)-p);
		System.out.println("Compound Intrest = "+ci);

	}

}
