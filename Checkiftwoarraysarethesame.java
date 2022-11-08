import java.util.Scanner;
import java.util.Arrays;

class Test5309930 {
  public static void main(String args[]){
    // Write code here
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int n2=s.nextInt();
    int arr1[]=new int[n1];
    int arr2[]=new int[n2];
    for(int i=0;i<n1;i++)
    {
      arr1[i]=s.nextInt();
      
    }
    for(int i=0;i<n2;i++)
    {
      arr2[i]=s.nextInt(); 
    }
    
    if(Arrays.equals(arr1,arr2)||n1==n2)
    {
      System.out.print("Same");
    }
    else
    {
      System.out.print("Not Same");
    }
  }
}
