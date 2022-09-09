import java.util.Scanner;

public class CheckAlphabetOrNot
{
	public static void main(String[] args) {
	    
	    Scanner s= new Scanner(System.in);
	    
	    String str=s.nextLine();
	    char ch=str.charAt(0);
	    if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
	        
		     System.out.println(ch+" is Alphabet");
	    }
	    else{
	        System.out.println(ch+" is not Alphabet");
	    }
	}
}
