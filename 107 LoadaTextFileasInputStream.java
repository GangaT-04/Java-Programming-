import java.io.InputStream;
import java.io.FileInputStream;

class LoadaTextFileasInputStream {
    public static void main(String a[]){
        try{
            InputStream in=new FileInputStream("D:\\GangaT-04\\Java Program\\src\\input.txt");
            System.out.println("Data in the file: ");
            
            int i=in.read();
            
            while(i!=1){
                System.out.print((char)i);
                i=in.read();
            }
            in.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
