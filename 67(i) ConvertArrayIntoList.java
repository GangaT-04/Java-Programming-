import java.util.Scanner;
import java.util.*;
class ConvertArrayIntoList {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        String[] array =new  String[n];
        for(int i=0;i<n;i++)
        {
            array[i]=s.nextLine();
        }
        System.out.println("Array: " + Arrays.toString(array));

        // convert array to list
        List list= new ArrayList<>(Arrays.asList(array));

        System.out.println("List: " + list);
    }
}
