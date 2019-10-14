public class JavaLowerTriangularMatrix
{
    public static void main(String [] args)
    {
        int arr[][] = {
                        {1, 2, 3},
                        {8, 6, 4},
                        {4, 5, 6}
                       };

        int row = arr.length;

        int col = arr[0].length;

        if(row != col)
        {
            System.out.println("Matrix should be a Square Matrix");
        }
        else
        {
            System.out.println("Lower Triangular Matrix:");

            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    if(j > i)
                    {
                        System.out.print("0 ");
                    }
                    else
                    {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                
                System.out.println();
            }
        }
    }
}