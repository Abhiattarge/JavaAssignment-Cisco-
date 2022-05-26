package assignmentArrayOfObject;

import java.util.Arrays;

public class Department1 {
	int deptid;
	String dName;
	Employee[] emps;
	
	public Department1() {}
	public Department1(int deptid,String dName,Employee[] emps)
	{
		this.deptid=deptid;
		this.dName=dName;
		this.emps=emps;
	}
	public String toString() {
		return "Department Name :"+dName+"Department id :"+deptid+"\nEmployee Working here :"+emps.length+"\n"+Arrays.toString(emps);
		}

}
