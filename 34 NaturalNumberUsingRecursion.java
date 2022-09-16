import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int number=s.nextInt();

		int sum=sumNaturalNumber(number);
		System.out.print("Sum of Natural Numbers:"+sum);
	}
	static int sumNaturalNumber(int number)
	{
		if(number!=0)
		{
			return number+sumNaturalNumber(number-1);
		}
		else{
			return number;
		}
	}
	
}