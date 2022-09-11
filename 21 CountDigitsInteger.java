import java.util.Scanner;

public class  CountDigits{

  public static void main(String[] args) {

    int count = 0;

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=s.nextInt();
    
    while(num != 0) {
      num /= 10;
      count++;
    }

    System.out.println("Number of digits: " + count);
  }
}
