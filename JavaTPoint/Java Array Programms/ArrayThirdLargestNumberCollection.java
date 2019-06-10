import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayThirdLargestNumberCollection
{
    public static int getThirdLargestNumberCollection(Integer [] arr, int total)
    {
        List<Integer> list = Arrays.asList(arr);

        Collections.sort(list);

        int element = list.get(total - 3);

        return element;
    }

    public static void main(String [] args)
    {
        Integer arr [] = {1, 2, 5, 6, 3, 2};

        Integer brr [] = {44, 66, 99, 77, 33, 22, 55};

        System.out.println();

        System.out.println("Values in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Third Largest Number: " + getThirdLargestNumberCollection(arr, arr.length));

        System.out.println("Values in Array:");

        for(int i : brr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Third Largest Number: " + getThirdLargestNumberCollection(brr, brr.length));
    }
}