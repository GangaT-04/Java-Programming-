import java.io.*;

public class CheckEvenOdd
{
	public static void main(String[] args)
	{
	    try {
	        DataInputStream d=new DataInputStream(System.in);
	        System.out.println("Enter the Number");
	        int n=Integer.parseInt(d.readLine());
	        if(n%2==0)
	        {
	            System.out.println("The number "+n+" is EVEN");
	        }
	        else
	        {
	            System.out.println("The number "+n+" is ODD");
	        }
	        
	    }
	    catch(Exception e) {
	    
		System.out.println(e);
	    }
	}
}
