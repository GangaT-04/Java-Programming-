import java.util.Scanner;
class PrimeNumber
{
    void prime(int start,int end)
    {
        
        while(start<=end)
        {
            int k=0;
            for(int i=2;i<=start/2;i++)
            {
                if(start%i==0)
                {
                    k=1;
                    break;
                }
            }
            if(k!=1 && start!=0 && start!=1){
                System.out.print(start+" ");
            }
            start++;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		
		PrimeNumber p=new PrimeNumber();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Two Intervals:");
		int start=s.nextInt();
		int end=s.nextInt();
		
		p.prime(start,end);
		
	}
}
