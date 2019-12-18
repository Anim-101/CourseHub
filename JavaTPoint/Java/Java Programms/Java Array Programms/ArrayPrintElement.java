public class ArrayPrintElement
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 5, 6};

        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}