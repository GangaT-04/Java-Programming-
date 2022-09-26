import java.util.Scanner;

class ConcatenateTwoArray 
{
    public static void main(String args[])    
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of element1");
        int n1=s.nextInt();
        
        int array1 []=new int[n1];
        System.out.println("Enter the Element");
        for(int i=0;i<n1;i++)
        {
            array1[i]=s.nextInt();
        }
        System.out.println("Enter the number of element2");
        int n2=s.nextInt();
        
        int array2 []=new int[n1];
        System.out.println("Enter the Element");
        for(int i=0;i<n2;i++)
        {
            array2[i]=s.nextInt();
        }
        int n3=n1+n2;
        int array3[]=new int[n3];
        int index=0;
        for(int i=0;i<n1;i++)
        {
           array3[index]=array1[i];  
           index++;
        }
        for(int i=0;i<n2;i++)
        {
            array3[index]=array2[i];
            index++;
        }
        for(int i=0;i<n3;i++)
        {
            System.out.print(array3[i]+" ");
        }
        
    }
}
