import java.util.*;
class HalfPyramid
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");
		int rows=s.nextInt();
		for(int i=1;i<=rows;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		       System.out.print("* "); 
		    }
		    System.out.print("\n");
		}
	}
}