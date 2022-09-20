import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the number of row1");
        int row1=s.nextInt();
        
        System.out.println("Enter the number of column1");
        int col1=s.nextInt();
        
        int fmatrix[][]=new int[row1][col1];
       
        int mulMatrix[][]=new int[row1][col1];
        
        System.out.println("Enter the first matrix ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                fmatrix[i][j]=s.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("Enter the number of row1");
        int row2=s.nextInt();
        
        System.out.println("Enter the number of column1");
        int col2=s.nextInt();
        
        int smatrix[][]=new int[row2][col2];
        System.out.println("Enter the second matrix ");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                smatrix[i][j]=s.nextInt();
            }
            System.out.print("\n");
        }
        if(row2==col1)
        {
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
               mulMatrix[i][j]+=fmatrix[i][j]*smatrix[i][j];
            }
        }
        }
        else
        {
            System.out.println("Error");
        }
        System.out.println("Multiply of Two matrix is");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.print(mulMatrix[i][j]+" ");
            }
            System.out.print("\n");
        }
           
    }
}
