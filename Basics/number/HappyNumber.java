class HappyNumber 
{
	public static  int isHappy(int n)
	{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int sq=r*r;
			sum+=sq;
			n/=10;
		}
		return sum;
	}

		public static void main(String[] args) 
	{
			int n=4;
			int m=n;
			while(m!=1 && m!=4)
		{
				m=isHappy(m);
				if(m==1) System.out.println("Happy Num :)");
				else System.out.println("UnHappy Num :)");
	}
}
}
