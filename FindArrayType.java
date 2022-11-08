class Test5309930 {
  public static void main(String args[]){
    // Write code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int even=0,odd=0;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
       if(arr[i]%2==0)
       {
         even++;
       }
       else
       {
         odd++;
       } 
    }
    if(even==n)
    {
      System.out.println("Even");
    }
    else if(odd==n)
    {
      System.out.println("Odd");
    }
    else
    {
      System.out.println("Mixed");
    }
  }
}
