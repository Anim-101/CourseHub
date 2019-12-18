public class ArrayThirdLargestNumber
{
    public static int getThirdLargestNumber(int [] arr, int total)
    {
        int temp = 0;

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

        return arr[total - 3];
    }

    public static void main(String [] args)
    {
        int a [] = {1, 2, 5, 6, 3};

        int b [] = {44, 66, 99, 77, 33, 22, 55};

        System.out.println();

        System.out.println("Values in First Array:");

        for(int i : a)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        
        System.out.print("Third Largest Number: " + getThirdLargestNumber(a, a.length));

        System.out.println();

        System.out.println();

        System.out.println("Values in Second Array:");

        for(int i : b)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Third Largest Number: " + getThirdLargestNumber(b, b.length));

        System.out.println();        
    }
}