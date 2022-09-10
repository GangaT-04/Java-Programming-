import java.util.Scanner;
public class FibanaciSeries
{
	public static void main(String args[])  
    {    
        int n1=0,n2=1,n3;    
    
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter the Number:");
        int num=s.nextInt();
        System.out.print("The Fibonacci Series is "+n1+" "+n2);
        for(int i=2;i<num;++i)   
        {    
           n3=n1+n2;
           System.out.print(" "+n3); 
           n1=n2;    
           n2=n3;    
        }       
    }  
}  
