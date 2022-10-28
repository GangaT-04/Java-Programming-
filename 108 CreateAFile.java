import java.io.File;
class CreateAFile {
     public static void main(String a[]){
         File f=new File("file1.java");
         try{
            boolean v=f.createNewFile();
            if(v)
            {
                System.out.print("New Java File is Created.");
                
            }
            else
            {
                System.out.print("Java File is already exists.");
            }
         }
         catch (Exception e){
             e.getStackTrace();
         }
     }
}
