import java.util.*;
class AddTwoNumbers 
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter two numbers");
    int first = s.nextInt();
    int second = s.nextInt();

    int sum = first + second;
    System.out.println("The sum is: " + sum);
  }
}
