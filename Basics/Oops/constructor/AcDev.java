class Ac //CONSTRUCTOR OVERLOADING BASED ON LENGTH
{
	int temp;
	Ac() // def cons\ arg
	{
		temp=22;
}
    Ac(int temp) //parm cons\ arg
	{
		this.temp=temp;
	}
}
class AcDev
{
	public static void main(String[] args) 
	{
		Ac ac1= new Ac();
		System.out.println(ac1.temp);
		Ac ac2= new Ac(20);
		System.out.println(ac2.temp);
	}
}
