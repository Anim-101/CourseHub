public class ArraySecondLargestNumber
{
    public static int getSecondLargestNumber(int arr [], int total)
    {
        int temp = 0;
        for(int i = 0; i < total; i++)
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

        return arr[total - 2];
    }

    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 5, 6};

        System.out.println("Values in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Second Largest Number: "  + getSecondLargestNumber(arr, arr.length));
    }
}