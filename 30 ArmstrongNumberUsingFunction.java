import java.util.Scanner;
class ArmstrongNumber
{
    void findArmstrong(int start,int end){
        
        for(int i=start;i<end;i++)
		 {
		     int sum=0,copy=i;
		     while(copy>0)
		     {
		         int rem=copy%10;
		         sum=sum+rem*rem*rem;
		         copy=copy/10;
		         
		     }
		     if(i==sum){
		         System.out.print(i+" ");
		     }
		 }
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	     ArmstrongNumber a= new ArmstrongNumber();
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter the two intervals:");
		 int start=s.nextInt();
		 int end=s.nextInt();
		 
		 System.out.print("The interval between "+start+" and "+end+" Armstrong Numbers are:");
		 
		 a.findArmstrong(start,end);
		 
		 
	}
}
