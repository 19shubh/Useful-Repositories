class calc
{
	public static void main(String[] args)
	{
		int n,a,b,ans;
		n=5;
		a=15;
		b=8;
		System.out.println("Calculator Menu");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus\n");
		switch(n)
		{
			case 1:
			{
				ans=a+b;
				System.out.println(a+"+"+b+"="+ans);
				break;
			}
			case 2:
			{
				ans=a-b;
				System.out.println(a+"-"+b+"="+ans);
				break;
			}	 
			case 3:
			{
				ans=a*b;
				System.out.println(a+"*"+b+"="+ans);
				break;
			}
			case 4:
			{
				ans=a/b;
				System.out.println(a+"/"+b+"="+ans);
				break;
			}
			case 5:
			{
				ans=a%b;
				System.out.println(a+"%"+b+"="+ans);
				break;
			}
			default:
				System.out.println("Wrong Input");
		}
	}
}