class ReversePyramid 
{
	public static void main(String[] args) 
	{
		int n=4;
		int st=n-1;
		int sp=0;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++) System.out.print(" ");
			for(int j=1; j<=st; j++) System.out.print("*");
		System.out.println();
		sp++;
		st-=2;
	}
}
}
