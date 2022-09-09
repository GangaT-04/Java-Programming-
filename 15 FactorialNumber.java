import java.util.Scanner;

public class FactorialNumber
{
	public static void main(String[] args) {
	    
	    Scanner s= new Scanner(System.in);
	    
	    System.out.println("Enter the Number:");
	    int N=s.nextInt();
	    int fact=1;
	    
	    for(int i=1;i<=N;i++)
	    {
	        fact=fact*i;
	    }
		
	    System.out.println("The Sum of Natural Number is "+fact);
	}
}
