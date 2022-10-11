
class AddTwoNumbers {
    int add;
    AddTwoNumbers(){
        this(12,34);
    }
    AddTwoNumbers(int num1,int num2){
        add=num1+num2;
    } 
    void display(){
        System.out.println("The Addition of Two Numbers:"+add);
    }
}
class Main1{
    public static void main(String a[]){
       AddTwoNumbers  m=new AddTwoNumbers();
       m.display();
    }
}
