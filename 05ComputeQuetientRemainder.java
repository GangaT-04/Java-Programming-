import java.io.*;
public class ComputeQuetientRemainder
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream d=new DataInputStream(System.in);
            System.out.println("Enter the Numerator");
            int num=Integer.parseInt(d.readLine());
            System.out.println("Enter the Denominator");
            int deno=Integer.parseInt(d.readLine());
            int que=num / deno;
            int rem=num % deno;
            System.out.println("The Quetient is:"+que);
            System.out.println("The Remainder is:"+rem);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
