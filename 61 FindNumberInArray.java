import java.util.*;

class FindNumberInArray {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number of Element");
        int n=s.nextInt();
        int array[]=new int[n];
        
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        System.out.print("Enter the Search Element:");
        int search=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]==search)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
            System.out.print(search+"Search Element Found");
        }
        else
        {
            System.out.println("Search Element is not Found");
        }
    }
    
}
