import java.util.Scanner;

public class MultiplicationTable
{
     public static void main(String args[])
     {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            int mul=num*i;
            System.out.println(num+"*"+i+"="+mul);
        }
     }
}
