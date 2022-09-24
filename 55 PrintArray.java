import java.util.Scanner;

class Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of Elements");
    int n=sc.nextInt();
    int array[]=new int[n];
    System.out.println("Enter the Elements:");
    for(int i=0;i<n;i++)
    {
        array[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(+array[i]+" ");
    }
    
  }
}
