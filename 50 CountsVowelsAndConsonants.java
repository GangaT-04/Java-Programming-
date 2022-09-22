import java.util.Scanner;
class CountsVowelsAndConsonants {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter the Sentence:");
        String sen=s.nextLine();
       
        int countVowels = 0;
        int countConsonant=0;
        int countNumbers=0;
        int countSpace=0;

        for(int i = 0; i < sen.length(); i++) {
            if(sen.charAt(i)=='a' || sen.charAt(i)=='e' || sen.charAt(i)=='i'|| sen.charAt(i)=='o' || sen.charAt(i)=='u') {
                countVowels++;
            }
            else if(sen.charAt(i)>=0 && sen.charAt(i)<=9)
            {
                countNumbers++;
            }
            else if(sen.charAt(i)==' ')
            {
                countSpace++;
            }
            else
            {
               countConsonant++;   
            }
        }

        System.out.println("Number of Vowels in a Sentence:" +countVowels);
        System.out.println("Number of Consonants in a sentence is:"+countConsonant);
        System.out.println("Number of Space in a sentence is:"+countSpace);
        System.out.println("Number of Digits in a sentence is:"+countNumbers);
    }
}
