package Abstract;
abstract class A{
	int i;
	static int j=20;
	final int k;
	final static int l;
	static 
	{
		l=45;
	}
	{
		k=100;
	}
	A()
	{
		i=10;
	}
void m1()
{
	System.out.println("concrete non-static method");
}

final void finalmethod()
{
	pm();
	System.out.println();
}
static void staticmethod()
{
	System.out.println("static method");
}
private void pm()
{
	System.out.println("private method");
	
}
abstract void abstractmethod();
}
class B extends A
{
	@Override
	void abstractmethod()
	{
		System.out.println("abstract method override");
	}
}
public class TestAbstract {

	public static void main(String[] args) {
		
A a=new B();
System.out.println(a.i);
System.out.println(A.j);
System.out.println(a.k);
System.out.println(A.l);

a.m1();
a.finalmethod();
a.staticmethod();
a.abstractmethod();
	}
}
