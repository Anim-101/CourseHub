public class BubbleSortFunction
{
    static void bubbleSort(int [] arr)
    {
        int number = arr.length;

        int temp = 0;

        for(int i = 0; i < number; i++)
        {
            for(int j = 1; j < (number - i); j++)
            {
                if(arr[j - 1] > arr[j])
                {
                    temp = arr[j-1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String [] args)
    {
        int arr[] = {3, 60, 35, 2, 4, 45, 60, 320, 5};

        System.out.println("Array Before Using Bubble Sort :");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        };

        System.out.println();

        System.out.println("Array After Using Bubble Sort :");

        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}