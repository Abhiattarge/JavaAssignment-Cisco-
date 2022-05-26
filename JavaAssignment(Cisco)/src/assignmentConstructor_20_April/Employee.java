package assignmentConstructor_20_April;

public class Employee {

	private String name;
	private float salary;
	private int id;
	private Dept dept;
	private MyDate mydate;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public float getSalary() {
		return salary;
	}
	
	public void setDept(Dept dept) {
		this.dept=dept;
	}
	public Dept getDept() {
		return dept;
	}
	public void setMyDate(MyDate mydate) {
		this.mydate=mydate;
	}
	public MyDate getMyDate() {
		return mydate;
	}

}
