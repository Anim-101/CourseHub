public class ArrayRightRotate
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int rotate = 4;

        System.out.println();

        System.out.println("Before Right Rotation:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        
        System.out.println("After Right Rotation:");

        for(int i = 0; i < rotate; i++)
        {
            int j, last = arr[arr.length - 1];

            for(j = arr.length - 1; j > 0; j--)
            {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}