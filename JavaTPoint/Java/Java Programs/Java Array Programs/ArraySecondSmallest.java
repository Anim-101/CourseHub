public class ArraySecondSmallest
{
    public static int getSecondSmalles(int arr [], int total)
    {
        int temp;

        for(int i = 0; i < total; i++)
        {
            for(int j = i + 1; j < total; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            }
        }

        return arr[1];
    }

    public static void main(String [] args)
    {
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 90};

        System.out.println();

        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Second Smallest Number: " + getSecondSmalles(arr, arr.length));
    }
}