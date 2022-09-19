import java.util.*;

class PowerUsingRecursion {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the base:");
        int base=s.nextInt();
        System.out.print("Enter the pow:");
        int pow=s.nextInt();
        
        int answer=calculatePower(base,pow);
        System.out.println(base+"^"+pow+" is "+answer);
    }
    static int calculatePower(int base,int pow)       
    {
        if(pow!=0)
        {
            return (base*calculatePower(base,pow-1));
        }     
        return 1;
    }
}
