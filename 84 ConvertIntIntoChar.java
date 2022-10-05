import java.util.*;
class ConvertIntIntoChar {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        
        char ch=(char)num;
        System.out.println(ch);
    }
}
