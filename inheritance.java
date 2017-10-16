import java.util.Scanner;
class calc
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
}
class sc_calc1 extends calc
{
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
class sc_calc2 extends calc
{
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
	void exp(int a,int b)
	{
		int ans=1;
		for(;b>0;b--)
		{
			ans=ans*a;
		}
		System.out.println("The result is "+ans);
	}
}
class calc_menu
{
	public static void main(String[] args)
	{
		char choice;
		do
		{
			sc_calc1 user1=new sc_calc1();
			sc_calc2 user2=new sc_calc2();
			int a,b,user,ch;
			System.out.print("Enter the user number (1/2)  ");
			Scanner num=new Scanner(System.in);
			user=num.nextInt();
			if(user==1)
			{
				System.out.println("Calculator Menu =>");
				System.out.println("1. ADDITION");
				System.out.println("2. SUBTRACTION");
				System.out.println("3. MULTIPLICATION");
				System.out.println("4. DIVISION");
				System.out.println("5. MODULUS");
				System.out.print("\nEnter your choice => ");
				ch=num.nextInt();
				switch(ch)
				{
					case 1:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();
						user1.add(a,b);
						break;
					}
					case 2:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();	
						user1.sub(a,b);
						break;
					}
					case 3:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();
						user1.mult(a,b);
						break;
					}
					case 4:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();
						user1.div(a,b);
						break;
					}
					case 5:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();
						user1.mod(a,b);
						break;
					}
					default:
					{
						System.out.println("Wrong input");
						break;
					}
				}
			}
			else if(user==2)
			{
				System.out.println("Calculator Menu =>");
				System.out.println("1. ADDITION");
				System.out.println("2. SUBTRACTION");
				System.out.println("3. MULTIPLICATION");
				System.out.println("4. DIVISION");
				System.out.println("5. MODULUS");
				System.out.println("6. EXPONENT");	
				System.out.print("\nEnter your choice => ");
				ch=num.nextInt();
				switch(ch)
				{
					case 1:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();
						user2.add(a,b);
						break;
					}
					case 2:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();	
						user2.sub(a,b);
						break;
					}
					case 3:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();
						user2.mult(a,b);
						break;
					}
					case 4:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();
						user2.div(a,b);
						break;
					}
					case 5:
					{
						System.out.println("Enter the two numbers ");
						a=num.nextInt();
						b=num.nextInt();
						user2.mod(a,b);
						break;
					}
					case 6:
					{
						System.out.print("Enter the base  ");
						a=num.nextInt();
						System.out.print("Enter the exponent  ");
						b=num.nextInt();
						user2.exp(a,b);
						break;
					}
					default:
					{
						System.out.println("Wrong input");
						break;
					}
				}
			}
			else
			{
				System.out.println("Wrong User  ");
			}
			System.out.print("Do you want to continue? ");
			choice=num.next().charAt(0);
		}while(choice=='y' || choice=='Y'); 
	}		
}