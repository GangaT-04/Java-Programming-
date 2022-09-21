import java.util.Scanner;

class MatrixMultiplicationUsigFuntion {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the number of row1");
        int row1=s.nextInt();
        
        System.out.println("Enter the number of column1");
        int col1=s.nextInt();
        
        int fmatrix[][]=new int[row1][col1];
       
               
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
        int mulMatrix[][]=matrixMutiply(fmatrix,smatrix,row1,col1,col2);
        System.out.println("Multiply of Two matrix is");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<row1;j++)
            {
                System.out.print(mulMatrix[i][j]+" ");
            }
            System.out.print("\n");
        }
 
    }
    static int[][] matrixMutiply(int[][] fmatrix, int[][] smatrix, int row1, int col1, int col2) {
        int mulMatrix[][]=new int[row1][col1];
 
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                for(int k=0;k<col1;k++)   
                    mulMatrix[i][j]+=fmatrix[i][k]*smatrix[k][j];
            }
        }
        return mulMatrix;  
    }
}

