class B  //initialization
{
	int i;
	 B()
	{
		i =18;
}
}
class Test1 
{
	public static void main(String[] args) 
	{
		B b = new B();
		System.out.println(b.i);
	}
}
