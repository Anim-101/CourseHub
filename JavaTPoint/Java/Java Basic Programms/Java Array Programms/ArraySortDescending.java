public class ArraySortDescending
{
    public static void main(String [] args)
    {
        int arr [] = {5, 2, 7, 8, 1, 9, 3, 4};

        int temp = 0;

        System.out.println();

        System.out.println("Elements Available in Array:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            }
        }

        System.out.println("Elements Available in Array Sorted in Descending Order:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}