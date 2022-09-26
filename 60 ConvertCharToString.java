import java.util.*;

class ConvertCharToString {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("***Convert Character to String and Vice versa***");
        System.out.println("1.Character to String\n2.String to Character\nEnter Your Choice:");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:System.out.print("Enter the No of Character");
                   int n=s.nextInt();
                   char[] ch=new char[5];
                   for(int i=0;i<n;i++)
                   {
                       ch[i]=s.next().charAt(0);
                   }
                   charToString(ch);
                   break;
            case 2:System.out.print("Enter the String");
                   String str=s.next();
                   char[] cha = str.toCharArray();
                   System.out.println(Arrays.toString(cha));
                break;
               
        }
    }
    static void charToString(char[] ch) {
         String str = String.valueOf(ch);
        System.out.println(str);
    }

    
}
