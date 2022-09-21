import java.util.*;

class FrequencyOfCharacter {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
       System.out.print("Enter the Sentence:");
       String sen=s.nextLine();
       
       System.out.print("Enter the letter to find frequency:");
        String str = s.nextLine();
        char ch=str.charAt(0);
        int frequency = 0;

        for(int i = 0; i < sen.length(); i++) {
            if(ch == sen.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}