public class ArrayElementsNumber
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println();

        System.out.println("Number of Elements: " + arr.length);

        System.out.println("Elements Are:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}