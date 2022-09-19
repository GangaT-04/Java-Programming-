import java.util.*;

class CalculateAverageUsingArray 
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Array Length:");
        int n=s.nextInt();
        int array[]= new int[n];
        
        int sum=0;
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=array[i];
        }
        double avg=sum/n;
        System.out.println("Average of Array Elements"+avg);
        
    }
}
