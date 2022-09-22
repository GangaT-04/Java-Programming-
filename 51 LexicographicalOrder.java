import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n=s.nextInt();
        
        String Words[]=new String[n];
        
        System.out.print("Enter the words");
        for(int i=0;i<n+1;i++)
        {
            Words[i]=s.nextLine();
        }

        for(int i = 0; i < n;i++) {
            for (int j = i + 1; j < n+1;j++) {
          
                if (Words[i].compareTo(Words[j]) > 0) 
                {
                    String temp = Words[i];
                    Words[i] = Words[j];
                    Words[j] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");
        for(int i = 0; i < n+1; i++) 
        {
            System.out.println(Words[i]);
        }
    }
}