import java.util.ArrayList;
import java.util.Scanner;
class ConvertListIntoArray {
    public static void main(String args[])
    {
        ArrayList list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        System.out.println("ArrayList: " + list);
        String array[]=new String[list.size()];
        list.toArray(array);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
