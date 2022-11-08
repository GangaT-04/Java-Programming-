import java.util.Scanner;
class Test5317403 {
  public static void main(String args[]){
    // Write code here
    Scanner s=new Scanner(System.in);
    int A=s.nextInt();
    int B=s.nextInt();
    int C=s.nextInt();
    int X=s.nextInt();
    if(1<=A && A<=10 && 1<=B && B<=10 && 1<=C && C<=10 && 1<=X && X<=10)
    {
      if(A==X || B==X || C==X)
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
