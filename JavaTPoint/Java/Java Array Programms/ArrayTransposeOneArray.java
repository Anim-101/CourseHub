public class ArrayTransposeOneArray
{
    public static void main(String [] args)
    {
        int arr [][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};

        System.out.println();

        System.out.println("Without Transpose:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Transpose:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}