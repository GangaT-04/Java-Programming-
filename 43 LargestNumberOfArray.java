import java.util.Scanner;

class LargestNumberOfArray 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter the Number of Elements:");
        int n=s.nextInt();
        
        int array[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        int max=array[0];
        for(int i=0;i<n;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
        }
        System.out.print("The Largest of the Element in Array:"+max);
        
    }
    
}
