class A
{
	int j;
	static void m1()
	{
	//	System.out.println(j);
		A a =new A();
		System.out.println(a.j);
	}
}
class T5 
{
	public static void main(String[] args) 
	{
		A.m1();
	}
}