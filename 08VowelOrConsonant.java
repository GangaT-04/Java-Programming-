import java.io.*;

public class VowelOrConsonant
{
	public static void main(String[] args)
	{
	    try {
	        DataInputStream d=new DataInputStream(System.in);
	        System.out.println("Enter the Number");
	        String str=d.readLine();
	        char ch=str.charAt(0);
	        if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')||(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
	        {
	            System.out.println("The Alphabet "+ch+" is Vowel");
	        }
	        else
	        {
	            System.out.println("The Alphabet "+ch+" is Consonant");
	        }
	        
	    }
	    catch(Exception e) {
	    
		System.out.println(e);
	    }
	}
}
