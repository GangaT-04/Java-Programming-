import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
class ConvertInputStreamToByteArray {
     public static void main(String a[]){
          try{
            byte[] val={12,65,98,43,45};
            InputStream stream=new ByteArrayInputStream(val);
            System.out.println("InputStream: " + stream);
            byte arr[]=stream.readAllBytes();
            System.out.println("Byte Array: "+Arrays.toString(arr));
          }
           catch(Exception e){
            e.getStackTrace();
        }
     }
}
