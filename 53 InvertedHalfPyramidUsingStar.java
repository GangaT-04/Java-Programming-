import java.util.*;
class InvertedHalfPyramid
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");
		int rows=s.nextInt();
		for(int i=rows;i>=1;i--)
		{
		    for(int j=1;j<=i;j++)
		    {
		       System.out.print("* "); 
		    }
		    System.out.print("\n");
		}
	}
}
