import java.util.Scanner;

class ConvertOctalToDecimal {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Choice");
        System.out.print("1.Convert Octal to Decimal\n2.Convert Decimal to Octal \n ==>");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:System.out.print("Enter the Octal Number(nter only 0 to 7):");
                   int oct=s.nextInt();
        
                   int decimal=convertDecimal(oct);
                   System.out.println(oct+" Equavalent Decimal Value is "+decimal);
                   break;
            case 2:System.out.print("Enter the Decimal Value:");
                   int number=s.nextInt();
                   int octalNumber=convertOctal(number);
                   System.out.println(number+" Equavalent Octal value is"+octalNumber);
                   break;
            default:System.out.println("You enter wrong choice...Please enter correct Choice(1 or 2)");
                   
        }
    }
    static int convertDecimal(int oct)
    {
        int decimal=0;
        int i=0;
        int remainder;
        while(oct!=0)
        {
            if(oct==0)
                break;
            else
            {
                remainder=oct%10;
                oct=oct/10;
                decimal+=remainder*Math.pow(8,i);
                i++;
            }
        }
        return decimal;
    }
    static int convertOctal(int number)
    {
       int octal = 0, i = 1;

        while (number != 0)
        {
            octal += (number % 8) * i;
            number /= 8;
            i *= 10;
        }

        return octal;
    }
    
}

