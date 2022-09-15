import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        
        int a=s.nextInt();
        int b=s.nextInt();
        int c,mention;
        System.out.println("Simple calculator:");
        System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
        System.out.println("Enter your calculation");
        int choice=s.nextInt();
        do
        {
        switch(choice)
        {
            case 1:c=a+b;
                   System.out.println(a+"+"+b+"="+c);
                    break;
            case 2:c=a-b;
                   System.out.println(a+"-"+b+"="+c);
                   break;       
            case 3:c=a+b;
                   System.out.print(a+"*"+b+"="+c);
                   break;
            case 4:c=a+b;
                   System.out.print(a+"/"+b+"="+c);
                   break;
        }
        System.out.println("Do You continue this calculation press (1/0)");
        mention=s.nextInt();
        }while(mention==1);
    }
    
}
