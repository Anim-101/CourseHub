public class ArrayLeftRotate
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int number = 6;

        System.out.println("Before Rotating to Left by " + number + " times, Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("After Rotating to Left by " + number + " times, Array:");

        for(int i = 0; i < number; i++)
        {
            int first = arr[0], j;

            for(j = 0; j < arr.length - 1; j++)
            {
                arr[j] = arr[j + 1];
            }

            arr[j] = first;
        }

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}