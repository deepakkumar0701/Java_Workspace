class A
{
static int i=45;
}
class B extends A
{

}
class Test4 
{
	public static void main(String[] args) 
	{
		System.out.println(A.i); //45
		System.out.println(B.i); //45

		A a=new	A();
		System.out.println(a.i); //45

		B b=new B();
		System.out.println(b.i); //45
	}
}
//not inheritance but resolving by JVM.
