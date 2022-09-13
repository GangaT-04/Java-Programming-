import java.util.Scanner;

public class CheckPrimeNumber
{
	public static void main(String[] args) {
	    
	    Scanner s= new Scanner(System.in);
	    
	    System.out.println("Enter the Number");
	    int num=s.nextInt();
	    
	    int k=0;
	    
	    if(num==0 || num==1)
	    {
	        System.out.println(num+" is not a Prime Number");
	    }
	   for(int i=2;i<=num/2;i++)
	    {
	        if(num%i==0)
	        {
	            k=1;
	            break;
	        }
	    }
	    if(k==0)
	    {
	        System.out.println(num+" is a Prime Number");
	    }
	    else{
	        System.out.println(num+" is not a Prime Number");
	    }
	  
	}
}
