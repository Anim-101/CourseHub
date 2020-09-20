public class ArrayLargestValue
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 1, 2, 3};

        System.out.print("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Largest Value in these Elements: ");

        int value = -1;
        for(int i = 0; i < arr.length; i ++)
        {
            if(value <= arr[i])
            {
                value = arr[i];
            }
        }

        System.out.print(value);

        System.out.println();
    }
}