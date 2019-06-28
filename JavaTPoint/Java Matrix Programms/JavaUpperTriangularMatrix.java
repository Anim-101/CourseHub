public class JavaUpperTriangularMatrix
{
    public static void main(String [] args)
    {
        int row, col;

        int arr[][] = {
                        {1, 2, 3},
                        {8, 6, 4},
                        {4, 5, 6}
                      };

        row = arr.length;

        col = arr[0].length;

        if(row != col)
        {
            System.out.println("Matrix Should be a Square Matrix");
        }
        else
        {
            System.out.println("Upper Triangular Matrix: ");

            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    if(i > j)
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