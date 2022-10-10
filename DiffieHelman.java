import java.util.*;

class DiffieHelman{
    public static int GeneratePublicKey(int p,int alpha,int a)
    {
        if(a==1)
        {
            return alpha;
        }
        else
        {
            return (((int)Math.pow(alpha,a))%p);
        }
    }
     public static int GenerateSecreteKey(int p,int alpha,int a)
    {
        if(a==1)
        {
            return alpha;
        }
        else
        {
            return (((int)Math.pow(alpha,a))%p);
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Global Public Elements\n");
        System.out.print("Prime Number:\n");
        int p=s.nextInt();
        
        System.out.print("Primitive roots Number:\n");
        int alpha=s.nextInt();
        
        System.out.print("\nEnter the User A Private Key:");
        int XA=s.nextInt();
        
        int YA=GeneratePublicKey(p,alpha,XA);
        System.out.println("The Public key for User B:"+YA);
        
        System.out.println("\nEnter the User B Private Key:");
        int XB=s.nextInt();
        
        int YB=GeneratePublicKey(p,alpha,XB);
        
        System.out.println("The Public key for User B:"+YB);
       
        int KA=GenerateSecreteKey(p,YB,XA);
        
        System.out.println("The Secrete Key for User A:"+KA);
        
        int KB=GenerateSecreteKey(p,YA,XB);
        
        System.out.println("The Secrete Key for User A:"+KB);
        
        
    }
}
