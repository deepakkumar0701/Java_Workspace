class A
{
	int i=100;
	void m1()
	{
		int i=55;
		System.out.println(i);  //55
		System.out.println(this.i); //100
	}
}
class T7
{
	public static void main(String[] args) 
	{
		A a1= new A();
		a1.m1();

	}
}
