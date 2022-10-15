import java.util.*;
class PassMethod {
  public int add(int a, int b) {
    int sum = a + b;
    return sum;
  }
  public void square(int num) {
    int result = num * num;
    System.out.println(result);    // prints 576
  }
  public static void main(String[] args) {

    PassMethod obj = new PassMethod();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the Two Numbers:");
    int n1=s.nextInt();
    int n2=s.nextInt();
    obj.square(obj.add(n1, n2));

  }
}
