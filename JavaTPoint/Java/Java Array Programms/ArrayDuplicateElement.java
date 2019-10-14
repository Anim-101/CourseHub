public class ArrayDuplicateElement
{
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 4, 2, 7, 8, 8, 3, 1, 2, 5, 6, 6, 9, 9};

        System.out.println("Elements in Array:");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Duplicate Element in Array");

        int duplicate [] = new int [arr.length];

        int visited = -1;

        for(int i = 0; i < arr.length; i++)
        {
            int count = 1;

            for(int j = i + 1; j < arr.length; j++)
            {

                if(arr[i] == arr[j])
                {
                    count++;

                    duplicate[j] = visited;
                }
            }

            if(duplicate[i] != visited)
            {
                duplicate[i] = count;
            }
        }

        for(int i = 0; i < duplicate.length; i++)
        {
            if((duplicate[i] != visited) && (duplicate[i] > 1))
            {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }
}