import java.io.*;
class demo {
    public static void main(String[] args)throws Exception 
    {  
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the number:");
        int p=Integer.parseInt(d.readLine());
        int copy,i=0,r;
        copy=p;
        int s=0;
        for(i=0;i<p;i++)
        {
            r=p%10;
            s=s*10+r;
            p=p/10;
        }
        if(copy==s)
          System.out.print("Polindrome");
         else
          System.out.print("Not a polindrome");
    }
}
