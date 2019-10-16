public class ArrayAddTwoMatrices
{
    public static void main(String [] args)
    {
        int arr [][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};

        int brr [][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};

        int crr [][] = new int [3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                crr [i][j] = arr [i][j] + brr [i][j];

                System.out.print(crr [i][j] + " ");
            }

            System.out.println();
        }
    }
}