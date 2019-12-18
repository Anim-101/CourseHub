public class ArrayDuplicateTempArray
{
    public static int removeDuplicateElements(int [] arr, int number)
    {
        if(number == 0 || number == 1)
        {
            return number;
        }

        int temp [] = new int [number];

        int j = 0;

        for(int i = 0; i < number - 1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[number - 1];

        for(int i = 0; i < j; i++)
        {
            arr[i] = temp[i];
        }

        return j;
    }

    public static void main(String [] args)
    {
        int arr [] = {10, 20, 30, 30, 40, 40, 40, 50, 60, 70, 80, 90};

        System.out.println();

        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        int length = arr.length;

        length = removeDuplicateElements(arr, length);

        System.out.println("Without Duplicate Elements in Array:");

        for(int i = 0; i < length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}