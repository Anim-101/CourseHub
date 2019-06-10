import java.util.Arrays;

public class ArraySecondLargestArrays
{
    public static int getSecondLargestNumber(int arr [], int total)
    {
        Arrays.sort(arr);

        return arr[total - 2];
                
    }

    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 5, 6, 10, 11, 12};

        System.out.println();
        
        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Second Largest Element: " + getSecondLargestNumber(arr, arr.length));
    }
}