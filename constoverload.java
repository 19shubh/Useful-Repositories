import java.util.Scanner;
class sum
{
	int a,b,c;
	float x,y;
	sum(int p,int q)
	{
		a=p;
		b=q;
		c=0;
		x=0;
		y=0;
	}
	sum(int p,int q,int r)
	{
		a=p;
		b=q;
		c=r;
		x=0;
		y=0;
	}
	sum(int p,float q)
	{
		a=p;
		x=q;	
		b=0;
		c=0;
		y=0;
	}
	sum(float p,float q)
	{
		x=p;
		y=q;
		a=0;
		b=0;
		c=0;
	}
	void sum1()	
	{
		if(c==0 && x==0 && y==0)
		{
			int sum;
			sum=a+b;
			System.out.println(a+" + "+b+" = "+sum);
		}
		else if(x==0 && y==0)
		{
			int sum;
			sum=a+b+c;
			System.out.println(a+" + "+b+" + "+c+" = "+sum);
		}
		else if(b==0 && c==0 && y==0)
		{
			float sum;
			sum=a+x;
			System.out.println(a+" + "+x+" = "+sum);
		}
		else
		{
			float sum;
			sum=x+y;
			System.out.println(x+" + "+y+" = "+sum);	
		}
	}
}
class menu
{
	public static void main(String[] args)
	{
		char choice;
		do
		{
			int user;
			System.out.println("SUM MENU=>");
			System.out.println("1. Sum of two integers");
			System.out.println("2. Sum of three integers");
			System.out.println("3. Sum of a integer and a float type");
			System.out.println("4. Sum of two floats");
			System.out.print("Enter your choice   ");
			Scanner ob=new Scanner(System.in);
			user=ob.nextInt();
			switch(user)
			{
				case 1:
				{
					int a,b;
					System.out.println("Enter two integers ");
					a=ob.nextInt();
					b=ob.nextInt();
					sum f=new sum(a,b);
					f.sum1();
					break;
				}
				case 2:
				{
					int a,b,c;
					System.out.println("Enter three integers ");
					a=ob.nextInt();
					b=ob.nextInt();
					c=ob.nextInt();
					sum f=new sum(a,b,c);
					f.sum1();
					break;
				}
				case 3:
				{
					int a;
					float b;
					System.out.print("Enter an integer ");
					a=ob.nextInt();
					System.out.println("Enter a float value ");
					b=ob.nextFloat();
					sum f=new sum(a,b);
					f.sum1();
					break;
				}
				case 4:
				{
					float a,b;
					System.out.println("Enter two float values ");
					a=ob.nextFloat();
					b=ob.nextFloat();
					sum f=new sum(a,b);
					f.sum1();
					break;
				}
				default:
				{
					System.out.println("Wrong Choice");
					break;	
				}
			}
			System.out.println("Do you want to continue(y/n)? ");
			choice=ob.next().charAt(0);
		}while(choice=='Y' || choice=='y');
	}
}
					