import java.util.*;
class functions
{
	
	void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	void sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println(a+"-"+b+"="+c);
	}	
	void mult(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println(a+"*"+b+"="+c);
	}
	void div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	void mod(int a,int b)
	{
		int c;
		c=a%b;
		System.out.println(a+"%"+b+"="+c);
	}
}
class calc
{
	public static void main(String[] args)
	{
		String choice;
		do
		{
			functions f=new functions();
			int a,b,user;
			System.out.println("Enter the two numbers ");
			Scanner num=new Scanner(System.in);
			a=num.nextInt();
			b=num.nextInt();
			System.out.println("Calculator Menu =>");
			System.out.println("1. ADDITION");
			System.out.println("2. SUBTRACTION");
			System.out.println("3. MULTIPLICATION");
			System.out.println("4. DIVISION");
			System.out.println("5. MODULUS");	
			System.out.println("\nEnter your choice => ");
			user=num.nextInt();
			switch(user)
			{
				case 1:
				{
					f.add(a,b);
					break;
				}
				case 2:
				{
					f.sub(a,b);
					break;
				}
				case 3:
				{
					f.mult(a,b);
					break;
				}
				case 4:
				{
					f.div(a,b);
					break;
				}
				case 5:
				{
					f.mod(a,b);
					break;
				}
				default:
				{
					System.out.println("Wrong input");
					break;
				}
			}
			System.out.print("Do you want to continue? ");
			choice=num.next();
		}while(choice.equals("yes") || choice.equals("YES")); 
	}		
}