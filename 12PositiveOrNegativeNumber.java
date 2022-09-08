import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    
	    System.out.println("Enter the Number:");
	    int value=s.nextInt();
	    
	    if(value>0){
		      System.out.println(value+" is Positive Number");
	    }
	    else{
	        System.out.println(value+" is Negative Number");
	    }
		 
	}
}
