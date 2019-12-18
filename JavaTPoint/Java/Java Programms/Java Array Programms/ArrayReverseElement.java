public class ArrayReverseElement
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Elements in Array by Given Order:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Elements in Array by Reverse Order:");

        for(int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}