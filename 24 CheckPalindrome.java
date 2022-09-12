import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the number");
	    int num=s.nextInt();
	    
	    int reverse=0;
	    int copy=num;
	    
	    while(num>0)
	    {
	        int remainder=num%10;
	        reverse=reverse*10+remainder;
	        num=num/10;
	    }
	    if(reverse==copy)
	    {
	        System.out.println("The"+copy+" number is a palindrome");
	    }
	    
	   else{
	    System.out.println("The "+copy+ "number is not a palindrome");
	   }
		
	}
}
