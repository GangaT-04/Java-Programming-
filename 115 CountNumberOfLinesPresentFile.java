import java.io.File;
import java.util.*;

class CountNumberOfLinesPresentFile {
    public static void main(String a[]){
        try{
            int count=0;
            File f=new File("file2.java");
            Scanner s=new Scanner(System.in);
            
            while(s.hasNextLine())
            {
                s.nextLine();
                count++;
            }
            System.out.print("Total number of Lines: "+count);
            s.close();
            
        }
         catch (Exception e){
             e.getStackTrace();
         }
    }
}
