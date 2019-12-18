public class ArraySmallestElement
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3};

        int value = arr[0];

        System.out.println();
        
        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Smallest Vallue Among All The Element in Array: ");

        for(int i = 0; i < arr.length; i++)
        {
            if(value > arr[i])
            {
                value = arr[i];
            }
        }

        System.out.print(value);

        System.out.println();
    }
}