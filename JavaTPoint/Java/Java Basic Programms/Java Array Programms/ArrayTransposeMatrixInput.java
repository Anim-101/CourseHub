import java.util.Scanner;

public class ArrayTransposeMatrixInput
{
    public static void main(String [] args)
    {
        System.out.println();

        System.out.println("Enter Total Rows and Total Columns:");

        System.out.print("Rows: ");

        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();

        System.out.println();

        System.out.print("Column: ");

        int columns = scan.nextInt();

        int arr[][] = new int [rows][columns];

        System.out.println("Enter Matrix:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        
        System.out.println("Before Transpose:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("After Transpose:");

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