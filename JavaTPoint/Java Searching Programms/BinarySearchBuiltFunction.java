import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchBuiltFunction
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Element Number: ");

        int size = scan.nextInt();

        System.out.println();

        System.out.println("Enter " + size + " Elements");

        int arr[] = new int [size];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println();

        System.out.print("Enter Number to be Searched: ");

        int key = scan.nextInt();

        System.out.println();

        int result = Arrays.binarySearch(arr, key);

        if(result >= 0)
        {
            ++result;

            System.out.println("Element Found on " + result + " Number Position");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
}