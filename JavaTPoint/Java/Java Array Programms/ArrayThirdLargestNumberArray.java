import java.util.Arrays;

public class ArrayThirdLargestNumberArray
{
    public static int getThirdLargestNumberArray(int arr[], int total)
    {
        Arrays.sort(arr);

        return arr[total - 3];
    }

    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 5, 6, 3, 2};

        int brr [] = {44, 66, 99, 77, 33, 22, 55};

        System.out.println();

        System.out.println("Values in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        
        System.out.print("Third Largest Number in Array: " + getThirdLargestNumberArray(arr, arr.length));

        System.out.println();

        System.out.println();

        System.out.println("Values in Array:");

        for(int i : brr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Third Largest Number in Array: " + getThirdLargestNumberArray(brr, brr.length));
    }
}