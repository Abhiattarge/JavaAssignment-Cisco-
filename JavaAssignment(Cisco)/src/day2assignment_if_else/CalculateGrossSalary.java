package day2assignment_if_else;

public class CalculateGrossSalary {

	public static void main(String[] args) {
		// write a java program to input basic salary of an employee and calculate its Gross salary.
		//according to following
		//Basic salary <= 10000 : HRA = 20%,DA=80%
		//Basic salary <= 20000 : HRA = 25%,DA=90%
		//Basic salary <= 20000: HRA = 30%,DA=95%
		
		double basic = 20000,gross,da,hra;
		
		if(basic <= 10000)
		{
			da=basic*0.8;
			hra=basic*0.2;
		}
		else if(basic <= 20000)
		{
			da=basic*0.9;
			hra=basic*0.25;
		}
		else
		{
			da=basic*0.95;
			hra=basic*0.3;
		}
		gross=basic*0.95;
		System.out.println("The Gross Salary is: "+gross);

	}

}
