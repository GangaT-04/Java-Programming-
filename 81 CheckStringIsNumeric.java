import java.util.*;
class CheckStringIsNumeric {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String in Numeric value");
        String str=s.nextLine();
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(str + " is a number");
        else
            System.out.println(str + " is not a number");
    }
}
