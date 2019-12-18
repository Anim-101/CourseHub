public class ArrayFrequency
{
    public static void main(String [] args)
    {
        int arrayMain [] = {1, 2, 8, 3, 2, 2, 2, 5, 1, 3, 3, 3, 2, 2, 2, 1, 1, 1, 8, 8, 3};

        int arrayFrequency [] = new int [arrayMain.length];

        int visited = -1;

        for(int i = 0; i < arrayMain.length; i++)
        {
            int count = 1;

            for(int j = i + 1; j < arrayMain.length; j++)
            {
                if(arrayMain[i] == arrayMain[j])
                {
                    count++;

                    arrayFrequency[j] = visited;
                }
            }

            if(arrayFrequency[i] != visited)
            {
                arrayFrequency[i] = count;
            }
        }

        System.out.println("---------------------------------------");
        
        System.out.println(" \t   Element | Frequency");

        System.out.println("----------------------------------------");

        for(int i = 0; i < arrayFrequency.length; i++)
        {
            if(arrayFrequency[i] != visited)
            {
                System.out.println("    \t\t" + arrayMain[i] + "  |  " + arrayFrequency[i]);
            }
        }

        System.out.println("---------------------------------------");
    }
}