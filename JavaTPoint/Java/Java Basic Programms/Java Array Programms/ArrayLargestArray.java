import java.util.Arrays;

public class ArrayLargestArray
{
    public static int getLargestNumber(int [] arr, int total)
    {
        Arrays.sort(arr);

        return arr[total - 1];
    }

    public static void main(String [] args)
    {
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.println();

        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Largest Number: " + getLargestNumber(arr, arr.length));
    }
}