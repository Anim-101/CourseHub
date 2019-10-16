public class ArrayLargestNumber
{
    public static int getLargestNumber(int arr [], int total)
    {
        int temp;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            }
        }

        return arr[total - 1];
    }

    public static void main(String [] args)
    {
        int arr [] = {10, 20, 30, 40, 50, 60, 70};

        System.out.println();

        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Largest Element in Array: " + getLargestNumber(arr, arr.length));
    }
}