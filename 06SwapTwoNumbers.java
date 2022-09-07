import java.io.*;
public class SwapTwoNumbers
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream d=new DataInputStream(System.in);
            System.out.println("Enter the Number1");
            int num1=Integer.parseInt(d.readLine());
            System.out.println("Enter the Number2");
            int num2=Integer.parseInt(d.readLine());
            int temp=num1;
            num1=num2;
            num2=temp;
            System.out.println("After the Swapping  the num1 is:"+num1+"  is:"+num2);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
