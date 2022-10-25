import java.io.*;
class demo {
    public static void main(String[] args)throws Exception 
    {  
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the number:");
        int p=Integer.parseInt(d.readLine());
        int i=0,r=1;
        
       
        for(i=0;i<p;i++)
        {
            r=p%10;
            break;
        }
        
          System.out.print("Unit digit of a number:"+r);
        
    }
}
