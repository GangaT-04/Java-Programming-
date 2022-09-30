import java.util.*;
class ConvertByteArrayToHex {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        int n=s.nextInt();
        byte bytes[]=new byte[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            bytes[i]=s.nextByte();
        }
        for (byte i : bytes) {
            String hex = String.format("%02X", i);
            System.out.println(hex);
        }
    }
}
