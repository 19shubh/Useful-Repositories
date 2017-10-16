class power
{
	public static void main(String[] args)
	{
		long base,exp,ans;
		base=3;
		exp=4;
		ans=1;
		for(int i=1;i<=exp;i++)
		{
			ans=ans*base;
		}
		System.out.println("The result is "+ans);
	}
}	
		