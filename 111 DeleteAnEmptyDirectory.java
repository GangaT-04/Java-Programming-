import java.io.*;
class DeleteAnEmptyDirectory {
    public static void main(String a[]){
         try{
            File direc=new File("Directory");
            boolean v=direc.delete();
            if(v)
            {
                System.out.print("Directory Deleted");
                
            }
            else
            {
                System.out.print("Directory not found.");
            }
         }
         catch (Exception e){
             e.getStackTrace();
         }
     }
}
