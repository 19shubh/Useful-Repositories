class reverse
{
	public static void main(String[] args)
	{
		int num,n,digit,rev;
		n=469;
		num=n;
		digit=num%10;
		rev=digit*100;
		num=num/10;
		digit=num%10;
		rev=rev+(digit*10);
		num=num/10;
		rev=rev+num;
		System.out.println("The original number is "+n);
		System.out.println("The reversed number is "+rev);
	}
}