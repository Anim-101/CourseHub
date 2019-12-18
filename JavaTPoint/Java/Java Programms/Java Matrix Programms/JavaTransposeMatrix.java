public class JavaTransposeMatrix
{
    public static void main(String [] args)
    {
        int row, col;

        int arr[][] = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                      };

        row = arr.length;

        col = arr[0].length;

        int trr[][] = new int [col][row];

        for(int i = 0; i < col; i++)
        {
            for(int j = 0; j < row; j++)
            {
                trr[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpose Matrix:");

        for(int i = 0; i < col; i++)
        {
            for(int j = 0; j < row; j++)
            {
                System.out.print(trr[i][j] + " ");
            }

            System.out.println();
        }
    }
}