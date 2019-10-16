public class ArrayTransposeMatrix
{
    public static void main(String [] args)
    {
        int arr [][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};

        int transpose [][] = new int [3][3];

        System.out.println();

        System.out.println("Matrix without Transpose:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                transpose [i][j] = arr [j][i];
            }
        }

        System.out.println("After Transpose:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(transpose [i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}