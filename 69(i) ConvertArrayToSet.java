import java.util.*;
class ArrayToSet {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the Number of elements:");
      int n=s.nextInt();
      String array[]=new String[n];
      System.out.println("Enter the elements:");
      for(int i=0;i<n;i++)
      {
          array[i]=s.next();
      }
      
        Set<String> set = new HashSet<>(Arrays.asList(array));
      
      System.out.println("Set is"+set);
    }
}
