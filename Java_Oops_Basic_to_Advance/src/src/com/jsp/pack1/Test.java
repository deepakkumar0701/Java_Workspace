package src.com.jsp.pack1;
class A{
	void m1() {
		
	}
}
class B extends A{
	void m1() {
		System.out.println(this.getClass().getSimpleName());
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("DEEPAK IS HERE");
		A a=new B();
		a.m1();
	}

}
