import java.util.*;

class StandardDeviation 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int num=s.nextInt();
        double array[]=new double[num];
        
        System.out.println("Enter the number of Elements:");
        for(int i=0;i<num;i++)
        {
            array[i]=s.nextDouble();
        }
        double sd=calculateSD(array,num);
        System.out.println("Standard Deviation:"+sd);
    }
    static double calculateSD(double array[],int n)
    {
        double sum=0.0;
        double square=0.0;
        for(int i=0;i<n;i++)
        {
            sum+=array[i];
        }
        double mean=sum/n;
        for(int i=0;i<n;i++)
        {
            square+=Math.pow(array[i]-mean, 2);
        }
        double standardDeviation=Math.sqrt(square/n);
          return standardDeviation;  
    }
        
}
