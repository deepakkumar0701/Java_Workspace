class B    //static member use in non static method..
{
	static int i=56;
	void m1()
	{
		System.out.println(this.i);  //56.... this keyword can be used to access static data numebr inside non-static method
	}
}
class T5
	{
	public static void main(String[] args) 
	{
		new B().m1();
	}
}
