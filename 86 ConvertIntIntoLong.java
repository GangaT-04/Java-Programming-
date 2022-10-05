import java.util.*;

class ConvertIntIntoLong {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the int value:");
        int num=s.nextInt();
        
        //using valueOf method()
        Long l1=Long.valueOf(num);
        
        System.out.println(l1);
    }
}
