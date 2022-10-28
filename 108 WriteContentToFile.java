import java.io.FileWriter;

class WriteContentToFile {
    public static void main(String a[]){
        String program="class Sample {"+"public static void main(String ar[]){"+"System.out.print(\"New Java File is Created\");"+"}"+"}";
        try{
            FileWriter out=new FileWriter("file1.java");
            out.write(program);
            System.out.println("Data is written to the file.");
            out.close();
        }
        catch (Exception e){
             e.getStackTrace();
         }
    }
}
