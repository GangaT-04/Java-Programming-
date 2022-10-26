import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
class ConvertStringToInputStream {
    public static void main(String a[]){
        String str="Java";
        System.out.println("String is: "+str);
        try{
            InputStream stream=new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            System.out.println("InputStream: " + stream);
             System.out.println("Available bytes at the beginning: " + stream.available());
             stream.read();
            stream.read();
            stream.read();
            System.out.println("Available bytes at the end: " + stream.available());

      stream.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
