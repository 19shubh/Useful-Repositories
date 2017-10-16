import java.util.Scanner;
class pal
{
	public static void main(String[] args)
	{
		long i,num,digit,rev;
		System.out.print("Enter the number=> ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		i=num;
		rev=0;
		for(;i>0;i=i/10)
		{
			digit=i%10;
			rev=(rev*10)+digit;
		}
		if(num==rev)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
	}
}	
		