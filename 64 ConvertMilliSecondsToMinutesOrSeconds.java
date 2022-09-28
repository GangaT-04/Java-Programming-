import java.util.Scanner;

class CovertMillisecondsToMinutesOrSeconds 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the MilliSeconds:");
        int ms=s.nextInt();
        int seconds=ms/1000;
        int minutes=(ms/1000)/60;
        System.out.println(ms+"MilliSeconds="+seconds+" sec");
        System.out.println(ms+"MilliSeconds="+minutes+" min");
    }
}
