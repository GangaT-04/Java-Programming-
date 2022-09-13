import java.util.Scanner;

public class Primenumber
{
	public static void main(String[] args) {
	    
	    Scanner s= new Scanner(System.in);
	    
	    System.out.println("Enter the two Intervals");
	    int start=s.nextInt();
	    int end=s.nextInt();
	    
	  while(start<end)
	  {
	    int k=0;
	    for(int i=2;i<=start/2;i++)
	    {
	        if(start%i==0)
	        {
	            k=1;
	            break;
	        }
	    }
	    if(k==0 && start!=0 && start!=1)
	    {
	        System.out.print(start+" ");
	    }
	    start++;
	  }
	  
	}
}
