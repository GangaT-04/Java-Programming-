import java.util.Scanner;

class CovertBinaryToOctal {
  public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter the Octal Number(nter only 1 or 0):");
        int bin=s.nextInt();
        int oct=convertBinaryToOctal(bin);
        System.out.println(bin+" inEquavalent octal Value is "+oct);
    }
    static int convertBinaryToOctal(int bin)
    {
        int octal=0;
        int i=0,decimal=0;
        int remainder;
        while(bin!=0)
        {
            decimal+=(bin%10)*Math.pow(2,i);
            i++;
            bin=bin/10;
        }
        i=1;
        while(decimal!=0)
        {
            octal+=(decimal%8)*i;
            decimal/=8;
            i*=10;
        }
        return octal;
    }
    
}
