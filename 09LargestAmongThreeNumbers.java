import java.io.*;

public class LargestAmongThreeNumbers
{
	public static void main(String[] args)
	{
	    try {
	        DataInputStream d=new DataInputStream(System.in);
	        System.out.println("Enter the Number1");
	        int num1=Integer.parseInt(d.readLine());
	        System.out.println("Enter the Number2");
	        int num2=Integer.parseInt(d.readLine());
	        System.out.println("Enter the Number3");
	        int num3=Integer.parseInt(d.readLine());
	        if((num1>num2) && (num1>num3))
	        {
	            System.out.println(num1+" is the Biggest Number");
	        }
	        else if((num2>num1) && (num2>num3))
	        {
	            System.out.println(num2+" is the Biggest Number");
	        }
	        else
	        {
	            System.out.println(num1+" is the Biggest Number");
	        }
	        
	    }
	    catch(Exception e) {
	    
		System.out.println(e);
	    }
	}
}
