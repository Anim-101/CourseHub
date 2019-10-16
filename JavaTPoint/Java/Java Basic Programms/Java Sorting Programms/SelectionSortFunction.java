public class SelectionSortFunction
{
    public static void selectionSort(int [] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int index = i;

            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[index])
                {
                    index = j;
                }
            }

            int temp = arr[index];

            arr[index] = arr[i];

            arr[i] = temp;
        }

    }

    public static void main(String [] args)
    {
        int arr[] = {9, 14, 3, 2, 43, 11, 58, 22};

        System.out.print("Before Applying Selection Sort: ");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        selectionSort(arr);

        System.out.print("After Applying Selection Sort: ");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}