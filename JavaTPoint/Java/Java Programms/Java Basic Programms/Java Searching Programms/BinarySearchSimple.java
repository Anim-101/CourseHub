public class BinarySearchSimple
{
    public static void binarySearch(int arr[], int first, int last, int key)
    {  
        int mid = (first + last) / 2;

        while(first <= last)
        {
            if(arr[mid] < key)
            {
                first = mid + 1;
            }
            else if(arr[mid] == key)
            {
                ++mid;

                System.out.println("Element Found on " + mid + " Number Position");
                
                break;
            }
            else
            {
                last = mid -1;
            }

            mid = (first + last) / 2;
        }

        if(first > last)
        {
            System.out.println("Element not Found");
        }
    }

    public static void main(String [] args)
    {
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int key = 30;

        int last = arr.length  - 1;

        binarySearch(arr, 0, last, key);
    }
}