public class JavaSubtractMatrix
{
    public static void main(String [] args)
    {

        int rows, cols;

        int arr [][] = {
                            {4, 5, 6},
                            {3, 4, 1},
                            {1, 2, 3}
                        };

        int brr [][] = {
                            {2, 0, 3},
                            {2, 3, 1},
                            {1, 1, 1}
                        };

        rows = arr.length;

        cols = arr[0].length;

        System.out.println();

        System.out.println("First 2-D Array:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("Second 2-D Array:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(brr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        int diff [][] = new int [rows] [cols];
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                diff[i][j] = arr[i][j] -brr[i][j];
            }
        }

        System.out.println("Subrtaction of Those Two Matrices:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(diff[i][j] + " ");
            }

            System.out.println();
        }
   }
}