import java.util.Scanner;

public class SumOfnaturalNumbers
{
	public static void main(String[] args) {
	    
	    Scanner s= new Scanner(System.in);
	    
	    System.out.println("Enter the Number:");
	    int N=s.nextInt();
	    int sum=0;
	    
	    for(int i=1;i<=N;i++)
	    {
	        sum=sum+i;
	    }
	    System.out.println("The Sum of Natural Number is "+sum);
	}
}
