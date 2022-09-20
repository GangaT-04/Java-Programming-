import java.util.Scanner;

class MatrixAddition 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the number of row");
        int row=s.nextInt();
        
        System.out.println("Enter the number of column");
        int col=s.nextInt();
        
        int fmatrix[][]=new int[row][col];
        int smatrix[][]=new int[row][col];
        int addMatrix[][]=new int[row][col];
        
        System.out.println("Enter the first matrix ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                fmatrix[i][j]=s.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("Enter the second matrix ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                smatrix[i][j]=s.nextInt();
            }
            System.out.print("\n");
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               addMatrix[i][j]=fmatrix[i][j]+smatrix[i][j];
            }
        }
        System.out.println("Addition of Two matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(addMatrix[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        
    }
}
