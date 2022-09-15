
import java.util.Scanner;
public class FactorsOfGivenNumber {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int number=s.nextInt();
        
	System.out.print(number+"  factors are: ");
	for(int i=1;i<=number;i++)
	{
            if(number%i==0)
	    {
                System.out.print(i+" ");
            }
        }
		
    }
    
}
