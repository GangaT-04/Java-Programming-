import java.util.*;
class ParentClass {
    int n1,n2;
    ParentClass(int n1,int n2){
       if(n1<n2)
       {
           System.out.print(n2+"is Greater than"+n1);
       }
       else{
           System.out.println(n1+"is Greater than "+n2);
       }
    }
    
}
class ChildClass extends ParentClass{
    ChildClass(int num1,int num2){
        super(num1,num2);
    }
}
class Main2{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number1");
        int num1=s.nextInt();
        System.out.print("Enter the number2:");
        int num2=s.nextInt();
        
        ChildClass c=new ChildClass(num1,num2);
    }
}
