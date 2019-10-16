import java.util.Scanner;

public class SelectionSortInput
{
    public static void main(String [] args)
    {
        int size, temp;

        Scanner scan = new Scanner (System.in);

        System.out.print("Enter Size of Array: ");

        size = scan.nextInt();

        int arr[] = new int [size];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.print("Before Applying Selection Sort: ");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("After Applying Selection Sort: ");

        for(int i = 0; i < size; i ++)
        {
            int index = i;

            for(int j = i + 1; j < size; j++)
            {
                if(arr[j] < arr[index])
                {
                    index = j;
                }
            }

            temp = arr[index];

            arr[index] = arr[i];

            arr[i] = temp;
        }

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}