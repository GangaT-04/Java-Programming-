import java.util.Scanner;
class ConvertBinaryToDecimal 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Choice");
        System.out.print("1.Convert Binary to Decimal\n2.Convert Decimal to Binary \n ==>");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:System.out.print("Enter the Binary Number(nter only 0's and 1's):");
                   long bin=s.nextLong();
        
                   int decimal=convertdecimal(bin);
                   System.out.println(bin+" Equavalent Decimal Value is "+decimal);
                   break;
            case 2:System.out.print("Enter the Decimal Value:");
                   int number=s.nextInt();
                   convertBinary(number);
                   break;
            default:System.out.println("You enter wrong choice...Please enter correct Choice(1 or 2)");
                   
        }
    }
    static int convertdecimal(long bin)
    {
        int decimal=0;
        long remainder;
        int i=0;
        while(bin!=0)
        {
            remainder=bin%10;
            bin=bin/10;
            decimal+=remainder*Math.pow(2,i);
            i++;
        }
        return decimal;
    }
    static void convertBinary(int number)
    {
        int binary[]=new int[40];
        
        int i=0;
        while(number>0)
        {
            binary[i++]=number%2;
            number=number/2;
        }
        for(int j=i-1;j>=0;j--)   
        {
            System.out.print(binary[j]);
        }
        System.out.println();
    }
}
