import java.util.Scanner;
import java.security.MessageDigest;
public class SHA1{
    public static void main(String[] args) {
        try{
            Scanner s =new Scanner(System.in);
            MessageDigest md=MessageDigest.getInstance("SHA1");
            System.out.println("Message digest object info :\n");
            System.out.println("Algorithm = "+md.getAlgorithm());
            /*System.out.print("Provider= "+md.getProvider());
            System.out.println("To String= "+md.toString());*/
            System.out.println("Enter the plaintext:");
            String input=s.next();
            md.update(input.getBytes());
            byte[] output=md.digest();
            System.out.println();
            System.out.println(input+" Equivalent Has Code is "+bytesToHex(output));
 
        }catch (Exception e) {
            System.out.println("Exception : "+e);
        }
    }
    public static String bytesToHex(byte[] b) {
        char hexDigit[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuffer buf=new StringBuffer();
        for(byte i=0;i<b.length;i++){
            buf.append(hexDigit[(b[i]>>4)&0x0f]);
            buf.append(hexDigit[b[i]&0x0f]);
        }
        return buf.toString();
    }
}