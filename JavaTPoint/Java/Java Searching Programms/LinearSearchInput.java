import java.util.Scanner;

public class LinearSearchInput
{
    public static void main(String [] args)
    {
        int size; 

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Size of Array:");

        size = scan.nextInt();

        System.out.println();

        System.out.println("Enter " + size + " Elements");

        int arr [] = new int [size];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter Elements to be Searched: ");

        int key;

        key = scan.nextInt();

        int index = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                index = i;
                
                break;
            }
        }

        if(index == -1)
        {
            System.out.println("Item not Found");
        }
        else
        {
            ++index;
            
            System.out.println("Item Found on " + index + " Number Position");
        }
    }
}