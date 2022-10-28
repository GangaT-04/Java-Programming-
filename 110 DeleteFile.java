import java.io.File;
class DeleteFile {
    public static void main(String a[]){
         File f=new File("file1.java");
         try{
            boolean v=f.delete();
            if(v)
            {
                System.out.print("File1 is Deleted.");
                
            }
            else
            {
                System.out.print("File1 is not exists.");
            }
         }
         catch (Exception e){
             e.getStackTrace();
         }
     }
}
