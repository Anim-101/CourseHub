public class JavaSparseMatrix
{
    public static void main(String [] args)
    {
        int rows, cols;

        int arr[][] = {
                        {4, 0, 0},
                        {0, 5, 0},
                        {0, 0, 6}
                      };

        rows = arr.length;

        cols = arr[0].length;

        int size = (rows + cols) / 2;

        int count = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(arr[i][j] == 0)
                {
                    count++;
                }
            }
        }

        if(count > size)
        {
            System.out.println("Given Matrix is a Sparse Matrix");
        }
        else
        {
            System.out.println("Given Matrix is not a Sparse Matrix");
        }
    }
}