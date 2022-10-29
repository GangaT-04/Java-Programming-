import java.io.*;
class GetFileNameFromAbsolutePath {
    public static void main(String a[])
    {
        File f=new File("D:\\GangaT-04\\Java Program\\src\\file1.java");
        String fn=f.getName();
        System.out.println("File Name "+fn);
    }
}
