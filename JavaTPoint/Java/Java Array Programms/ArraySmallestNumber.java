public class ArraySmallestNumber
{
    public static int getSmallestNumber(int [] arr, int total)
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

        return arr[0];
    }

    public static void main(String [] args)
    {
        int arr [] = {10, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println();

        System.out.println("Elements in Array");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Smallest Number: " + getSmallestNumber(arr, arr.length));
    }
}