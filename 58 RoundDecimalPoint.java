import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
class RoundDecimalPoint {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Decimal Number");
        double num=s.nextDouble();
        /*System.out.format("%.4f",num);*/
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.print(df.format(num));
        
        
    }
    
}
