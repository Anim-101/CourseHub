import java.util.Scanner;

public class InsertionSortInput
{
    public static void main(String [] args)
    {
        int size;

        System.out.print("Enter Size of Array: ");

        Scanner scan = new Scanner(System.in);

        size = scan.nextInt();

        int arr [] = new int [size];

        System.out.println("Enter " + size + " Elements:");

        for(int i = 0 ; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println();

        System.out.println("Before Applying Insertion Sort:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("After Applying Insertion Sort:");

        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];

            int j = i - 1;

            while((j > -1) && (arr[j] > key))
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}