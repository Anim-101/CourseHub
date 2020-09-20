public class ArrayOddEven
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 5, 6, 3, 2};

        System.out.println();

        System.out.println("Array Elements:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Odd Numbers:");

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0)
            {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.println();

        System.out.println("Even Numbers:");

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.println();
    }
}