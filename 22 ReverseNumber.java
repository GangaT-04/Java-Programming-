import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Number");
	    int num=s.nextInt();
	    
	    int reverse=0;
	    while(num>0)
	    {
	        int rem=num%10;
	        reverse=reverse*10+rem;
	        num=num/10;
	    }
	    System.out.println("The reverse the number is "+reverse);
		
	}
}
