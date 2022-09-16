import java.util.Scanner;
class GCD
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the two numbers:");
		int num1=s.nextInt();
		int num2=s.nextInt();

		int gcd=GCDOfTwoNumbers(num1,num2);
		System.out.print("GCD of  "+num1+ " and "+num2+" is "+gcd);
	}
	static int GCDOfTwoNumbers(int num1,int num2)
	{
		if(num2>num1)
      			return GCDOfTwoNumbers(num2,num1);
   		if(num2==0)
     			 return num1;
   		else
      			return GCDOfTwoNumbers(num2,num1%num2);
	}
	
}