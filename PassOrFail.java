import java.util.Scanner;


class Test5323553 {
  public static void main(String args[]){
    // Write code here
    Scanner s=new Scanner(System.in);
    int T=s.nextInt();
    for(int i=0;i<T;i++)
    {
      int N=s.nextInt();
      int X=s.nextInt();
      int P=s.nextInt();
      int in=N-X;
      X=X*3;
      int m=X-in;
      if(m>=P)
      {
        System.out.print(" PASS");
        
      }
      else
      {
        System.out.print(" FAIL");
      }
    }
  }
}
