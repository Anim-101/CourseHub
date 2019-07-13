public class JavaAllSubSetString
{
    public static void main(String [] args)
    {
        String string = "ANIM";

        int length = string.length();

        int temp = 0;

        String [] array = new String [length * (length + 1) / 2];

        for(int i = 0; i < length; i++)
        {
            for(int j = i; j < length; j++)
            {
                array[temp] = string.substring(i, j + 1);

                temp++;
            }
        }

        System.out.println("All Subsets are Given String are:");

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}