import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int number=s.nextInt();

		int fact=factorialOfNumber(number);
		System.out.print("Factorial of "+number+":"+fact);
	}
	static int factorialOfNumber(int number)
	{
		if(number>=1)
		{
			return number+factorialOfNumber(number-1);
		}
		else{
			return 1;
		}
	}
	
}