public class InsertionSortSimple
{
    public static void main(String [] args)
    {
        int [] arr = {9, 14, 3, 2, 43, 11, 58, 22};

        System.out.print("Before Applying Insertion Sort: ");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("After Applying Insertion Sort: ");

        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];

            int j = i - 1;

            while((j > -1) && (arr[j] > key))
            {
                arr[j+1] = arr[j];
                
                j--;
            }

            arr[j + 1] = key;
        }

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}