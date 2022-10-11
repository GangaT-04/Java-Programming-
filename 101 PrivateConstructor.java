
class PrivateConstructor {
    private PrivateConstructor(){
        System.out.print("Tis is a Private Constructor");
    }
    public static void instanceMethod(){
        PrivateConstructor P=new PrivateConstructor();
    }
}
class m{
    public static void main(String args[]){
        
        PrivateConstructor.instanceMethod();
    }
}