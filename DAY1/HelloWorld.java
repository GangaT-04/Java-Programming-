import java.io.*;

public class HelloWorld 
{

    public static void main(String[] args) 
    {
      try
      {
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("Enter a number: ");
        int number =Integer.parseInt(d.readLine());
      
        System.out.println("You entered: " + number);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
}
