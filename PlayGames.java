import java.util.Scanner;


class Test5317403 {
  public static void main(String args[]){
    // Write code here
    Scanner s=new Scanner(System.in);
    int X=s.nextInt();
    if(100<=X && X<=169)
    {
      X=X+7;
      if(X>160)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
      
    }
  }
}
