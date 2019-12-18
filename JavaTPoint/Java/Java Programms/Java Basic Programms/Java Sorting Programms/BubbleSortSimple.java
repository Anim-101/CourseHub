public class BubbleSortSimple
{
    public static void main(String [] args)
    {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.print("Array Before Using Bubble Sort : ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Array After Using Bubble Sort : ");

        int temp = 0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 1; j < (arr.length - i); j++)
            {
                if(arr[j - 1] > arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}