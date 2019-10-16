public class ArraySumElements
{
    public static void main(String [] args)
    {
        int arr [] = {10, 15, 20, 25, 30, 45, 40, 12, 33, 46, 17, 18};

        int sum = 0;

        System.out.println();
        
        System.out.println("Elements in Array: ");

        for(int i : arr)
        {
            sum = sum + i;

            System.out.print(i + " ");
        }

        System.out.println();
        
        System.out.println("Total Sum of Elements: " + sum);
    }
}