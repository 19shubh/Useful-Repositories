class search
{	
	public static void main(String[] args)
	{
		int num[]=new int[10];
		int user,pos=0,flag=0;
		int beg,mid,end;
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		num[5]=60;
		num[6]=70;
		num[7]=80;	
		num[8]=90;
		num[9]=100;
		user=30;
		beg=0;
		end=9;
		mid=(beg+end)/2;
		while(beg<=end)
		{
			if(user==num[mid])
			{
				flag=1;
				pos=mid+1;
				break;
			}
			else if(user<num[mid])
				end=mid-1;
			else
				beg=mid+1;
			mid=(beg+end)/2;
		}				
		if(flag==0)
			System.out.println("The number is not found in the array");
		else
			System.out.println("Number found at position "+pos);
	}
}