
package myFourth;

public class Employee {
String ename;
private int eid;
Employee(){
}


protected Employee(int id ,String name)
{
this.eid = id;
this.ename = name;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public void displayee() 
{
	System.out.println("Name : " + ename );

}
}

class PermenantEmployee extends Employee
{
	
	PermenantEmployee(int empid , String name , float salary, String address) {
		super(empid,name);
		this.salary = salary;
		this.address= address;		
	}

	private float salary;
	private String address;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getSddress() {
		return address;
	}

	public void setSddress(String sddress) {
		this.address = sddress;
	}
	public void display() {
		System.out.println("Salary : " + salary + " Address : " + address);
	}
}
