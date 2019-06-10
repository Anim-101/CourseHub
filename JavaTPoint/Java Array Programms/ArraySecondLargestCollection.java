import java.util.*;

public class ArraySecondLargestCollection
{
    public static int getLargestNumber(Integer arr [], int total)
    {
        List<Integer> list = Arrays.asList(arr);

        Collections.sort(list);

        int element = list.get(total - 2);

        return element;
    }

    public static void main(String [] args)
    {
        Integer arr []  = {10, 20, 30, 40, 50, 60, 70};

        System.out.println();

        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Second Largest Number: " + getLargestNumber(arr, arr.length));
    }
}