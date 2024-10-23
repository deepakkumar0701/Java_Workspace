class A  // COPY CONSTRUCTOR...CONSTRUCTOR OVERLOADING BASED ON TYPES OF ARGUMENTS
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	A(A a)
	{
		this.i=a.i;
	}
	void display()
	{
		System.out.println("i= "+i);
	}
}
class Test2
{
	public static void main(String[] args) 
	{
		A a1= new A(45);
		a1.display();
		A a2= new A(a1);  // passing same arguments / copy
		a2.display();
	}
}
