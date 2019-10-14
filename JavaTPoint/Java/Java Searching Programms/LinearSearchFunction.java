public class LinearSearchFunction
{
    public static int linearSearch(int arr[], int key)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return ++i;
            }
        }

        return - 1;
    }

    public static void main(String [] args)
    {
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80};

        int key = 50;

        if(linearSearch(arr, key) == -1)
        {
            System.out.println("Item Not Found");
        }
        else
        {
            System.out.println("Item Found on " + linearSearch(arr, key) + " Number Position");
        }
    }
}