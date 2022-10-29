import java.io.*;
class GetTheFileExensions {
    public static void main(String a[])
    {
        File f=new File("Test.java");
        String fn=f.toString();
        int i=fn.lastIndexOf('.');
        if(i>0)
        {
            String ex=fn.substring(i+1);
            System.out.println("File extension is "+ex);    
        }
    }
}
