package myFourth;

class A{
	int i;

	A(int i)
	{
		this.i/* data member*/ = i/*parameter*/;
		System.out.println("A(int i)");
	}
	
	public void show()
	{
		System.out.println("Value of A.i is:"+i);
	}
}

class B extends A{
	int j;
	public B(int p,int j)
	{
		super(p); //shud be first statment in cosntructor
		this.j = j; 
		System.out.println("B(int i,int j)");
	}
	public void show()
	{
		super.show();
		System.out.println("Value of B.j is:"+j);
	}
}

class C extends B{
	int k;
	public C(int i,int j,int k)
	{
		super(i,j);
		this.k = k;
		System.out.println("C(int i,int j,int k)");
	}
	
	public void show()
	{
		
		System.out.println("Value of C.k is:"+k);
		super.show();
	}
}

class D extends C{
	float flt;
	public D(int i,int j,int k,float flt)
	{
		super(i,j,k);
		this.flt = flt;
		System.out.println("C(int i,int j,int k, float flt)");
	}
	
	public void show()
	{
		
		System.out.println("Value of C.k is:"+k);
		super.show();
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		C obj = new C(10,20,30);
		obj.show();
		
		D objD = new D(10,20,30,19);
		objD.show();
	}

}

