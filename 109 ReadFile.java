import java.io.BufferedInputStream;
import java.io.FileInputStream;
class ReadFile {
    public static void main(String a[]){
        try{
            FileInputStream f=new FileInputStream("file1.java");
            BufferedInputStream b=new BufferedInputStream(f);
            
            int i=b.read();
            while(i!=-1)
            {
                System.out.print((char)i);
                i=b.read();
            }
            b.close();
            
        }
         catch (Exception e){
             e.getStackTrace();
         }
    }
}
