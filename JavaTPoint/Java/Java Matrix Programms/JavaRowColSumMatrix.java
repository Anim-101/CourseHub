public class JavaRowColSumMatrix
{
    public static void main(String [] args)
    {
        int arr[][] = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                      };

        int row = arr.length;

        int col = arr[0].length;

        int sumRow = 0;

        int sumCol = 0;

        for(int i = 0; i < row; i++)
        {
            sumRow = 0;

            for(int j = 0; j < col; j++)
            {
                sumRow = sumRow + arr[i][j];
            }

            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }

        for(int i = 0; i < col; i++)
        {
            sumCol = 0;

            for(int j = 0; j < row; j++)
            {
                sumCol = sumCol + arr[j][i];
            }

            System.out.println("Sum of " + (i + 1) + " column: "  + sumCol);
        }
    }
}