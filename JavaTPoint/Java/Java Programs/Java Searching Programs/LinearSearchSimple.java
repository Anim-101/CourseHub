public class LinearSearchSimple
{
    public static void main(String [] args)
    {
        int [] arr = {10, 20, 30, 40, 50, 60, 70};
        
        int key = 50;

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
            System.out.println("Item Not Found");
        }
        else
        {
            ++index;
            
            System.out.println("Item Found on " + index + " Number Position");
        }
    }
}