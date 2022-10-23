[10/22, 21:26] Ganga: import java.util.Scanner;
class Question {  //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();  //Read e1
int e2 = sc.nextInt();  //Read e2
}
public class Question2{
static void swap(Question q){
  int temp;
  temp=q.e1;
  q.e1=q.e2;
  q.e2=temp;
}
[10/22, 21:28] Ganga: public static void main(String[] args) {
//Create an object of class Question
	Question t = new Question ();
  //Call the method swap()
swap(t);

System.out.println(t.e1+" "+t.e2);    
  }

}
