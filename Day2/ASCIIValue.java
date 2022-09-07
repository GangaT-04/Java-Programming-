import java.util.Scanner;

public class ASCIIValue
{
    public static void main(String[] args) 
    {
        Scanner read=new Scanner(System.in);
      
        System.out.println("Enter the character");
        String str=read.next();
      
        char ch=str.charAt(0);
        int ASCII=ch;
      
        System.out.println("ASCII Value is:"+ASCII);
        
    }
}
