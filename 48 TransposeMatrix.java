import java.util.Scanner;

class TransposeMatrix 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the number of row");
        int row=s.nextInt();
        
        System.out.println("Enter the number of column");
        int col=s.nextInt();
        
        int matrix[][]=new int[row][col];
        
        int transpose[][]=new int [col][row];
        
        System.out.println("Enter the  matrix ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=s.nextInt();
            }
            System.out.print("\n");
        }
       
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Transpose Matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        
    }
}



