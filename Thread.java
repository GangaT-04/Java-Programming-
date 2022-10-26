public class Question1 extends Thread
{
  public void run(){
    System.out.print("Thread is Running.");
  }
public static void main(String args[]){  
		Question1 thread=new Question1();  
		thread.start();
	}  
}
