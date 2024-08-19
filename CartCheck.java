package mySecond;

public class study004 {

}
class product{
	String name;
	int i;
	private static int number_of_products = 100;
	product()
	{
		i=0;
		name="";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	product(int pid,String pname)
	{
		this();
		i=pid;
		name=pname;
	  int count=10;    ;
	}
	void display()
	{
		System.out.println("id = " + i + ", name = " + name);
	}
}
