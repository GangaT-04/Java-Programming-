import java.io.File;
import java.net.URI;
class GetRelativePathFromTwoAbsolutePaths {
    public static void main(String a[])
    {
        try
        {
            File aPath1=new File("D:\\GangaT-04\\Java Program\\src\\file1.java");
            System.out.println("Absolute Path1: "+aPath1);
            
            File aPath2=new File("D:\\GangaT-04\\Java Program\\src\\file2.java");
            System.out.println("Absolute Path2: "+aPath2);
            
            URI path1=aPath1.toURI();
            URI path2=aPath2.toURI();
            
            URI rPath=path2.relativize(path1);
            
            String path=rPath.getPath();
            System.out.println("Relative Path: "+path);
            
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
