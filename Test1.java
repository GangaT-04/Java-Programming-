import java.util.Scanner;
public class Question5{
	public static void main(String args[]){

        int arr[] = new int[6];
int sum=0;
int n=arr.length;
int k=0;
for(int i=0;i<n;i++)
{
  if(arr[i]%2!=0){
    sum+=arr[i];
    k++;
  }
}
double avg=sum/k;
System.out.print(avg);
}
}
