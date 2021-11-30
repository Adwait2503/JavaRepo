import java.util.Scanner;

class FactorialRecursive 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number who's Factorial you want to find :- ");
		int num=sc.nextInt();
		System.out.print("The Factorial of "+num+" is:- "+fact(num));
	}
	public static int fact(int num)
	{
		int fact=1;
		if (num==0)
		{
			return 1;
		}
		fact=num*fact(--num);
		System.out.println(fact);
		return fact;
	}

}