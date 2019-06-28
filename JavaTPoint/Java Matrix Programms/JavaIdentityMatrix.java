public class JavaIdentityMatrix
{
    public static void main(String [] args)
    {
        int rows,cols;

        boolean flag=true;

        int arr[][] = {
                        {1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1}
                      };

        rows = arr.length;

        cols = arr[0].length;

        if(rows != cols)
        {
            System.out.println("Matrix should be a square Matrix");
        }
        else
        {
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < cols; j++)
                {
                    if(i == j && arr[i][j] != 1)
                    {
                        flag = false;
                    }

                    if(i != j && arr[i][j] !=0)
                    {
                        flag = false;
                    }
                }
            }
        }

        if(flag)
        {
            System.out.println("Given Matrix is an Identity Matrix");
        }
        else
        {
            System.out.println("Given Matrix is not an Identity Matrix");
        }
    }
}