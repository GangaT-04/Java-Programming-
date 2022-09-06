import java.util.*;
class MultiplyTwoNumbers 
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    float num1,num2;
    System.out.println("Enter two numbers:");
    num1 = s.nextInt();
    num2 = s.nextInt();

    float product = num1 * num2;
    System.out.println("The Multiply of two number is: " + product);
  }
}
