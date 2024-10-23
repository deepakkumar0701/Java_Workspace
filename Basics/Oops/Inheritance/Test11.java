class Human     //super keyword and super() and this keyword and this()
{
	String name;
	int age;
	String gender;

Human(String name, int age, String gender)
{
	this.name=name;
	this.age=age;
	this.gender=gender;
}
void display()
{
	System.out.println("Name:"+name);
	System.out.println("age:"+age);
	System.out.println("gender:"+gender);
}
}
class Teacher extends Human
{
	String Subject;

Teacher(String name, int age, String gender, String Subject)
	{
	super(name,age,gender);
	this.Subject=Subject;
}
void display()
	{
	super.display();
	System.out.println("Subject:"+Subject);
	System.out.println("************************************");
	}
}
class Doctor extends Human
{
	String Specialist;

Doctor(String name, int age, String gender, String Specialist)
	{
	super(name,age,gender);
	this.Specialist=Specialist;
}
void display()
	{
	super.display();
	System.out.println("Specialist:"+Specialist);
	}
}
class  Test11 
{
	public static void main(String[] args) 
	{
		Teacher t1= new Teacher("RAMAN",25,"MALE","JAVA");
			t1.display();
		Doctor d1= new Doctor("RAMA",27,"MALE","NEURO SURGEON");
			d1.display();
	}
}
