public class ArrayTwoMatricesMultiplication
{
    public static void main(String [] args)
    {
        int arr [][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int brr [][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int crr [][] = new int[3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                crr [i][j] = 0;

                for(int k = 0; k < 3; k++)
                {
                    crr [i][j] += arr [i][k] * brr [k][j];
                }

                System.out.print(crr [i][j] + " ");
            }

            System.out.println();
        }
    }
}