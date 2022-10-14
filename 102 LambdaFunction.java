import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    // create an ArrayList
    ArrayList<String> languages = new ArrayList<>(Arrays.asList("java", "python"));
    System.out.println("ArrayList: " + languages);

    // call the foEach() method
    // pass lambda as argument fo forEach()
    // reverse each element of ArrayList
    System.out.print("Reversed ArrayList: ");
    languages.forEach((e) -> {

      // body of lambda expression
      String result = "";
      for (int i = e.length()-1; i >= 0 ; i--)
      result += e.charAt(i);
      System.out.print(result + ", ");
    });

  }
}
