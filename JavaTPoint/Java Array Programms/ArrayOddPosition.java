public class ArrayOddPosition
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("All Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Elements are at Odd Position in Array:");

        for(int i = 0; i < arr.length; i = i + 2)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}