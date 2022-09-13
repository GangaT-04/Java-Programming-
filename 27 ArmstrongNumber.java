import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args) {
	    
	    Scanner s= new Scanner(System.in);
	    
	    System.out.print("Enter the Number:");
	    int num=s.nextInt();
	    int arm=0;
	    int copy=num;
	  while(num>0)
	  {
	      int rem=num%10;
	      arm=arm+rem*rem*rem;
	      num=num/10;
	  }
	  if(copy==arm)
	  {
	      System.out.println(copy+" is the Armstrong Number");
	  }
	  else{
	      System.out.println(copy+" is not Armstrong Number");
	  }
	  
	}
}
