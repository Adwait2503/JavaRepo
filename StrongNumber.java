package basic_programming;
class StrongNumber 
{
	public static int fact(int a)
	{
		int fact=1;
		for (int i=2;i<=a ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		int num=141,sum=0,temp=num;
		while (temp!=0)
		{
			int d=temp%10;
			sum=sum+fact(d);
			temp=temp/10;
		}
		if (num==sum)
		{
			System.out.println("The Number "+num+" is a Strong Number...");
		}
		else{
			System.out.println("The Number "+num+" is Not a Strong Number...");
		}
	}
}
