import java.util.*;
class BubbleSort {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=s.nextInt();
        int a[]=new int[n];
        int temp;
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("After the sorting Elements in Decending Order:");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        
    }
}
