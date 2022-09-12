import java.util.Scanner;
public class PowerOfNumber
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Base");
	    int base=s.nextInt();
	    
	    System.out.println("Enter the Exponent");
	    int exponent=s.nextInt();
	    
	    int ans=1;
	    int ex=exponent;
	    
	    while(exponent!=0)
	    {
	        ans=ans*base;
	        exponent--;
	    }
	   
	    System.out.println(base+"^"+ex+"="+ans);
		
	}
}
