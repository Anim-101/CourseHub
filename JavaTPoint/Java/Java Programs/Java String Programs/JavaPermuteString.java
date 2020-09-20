public class JavaPermuteString
{
    public static String swapString(String a, int i, int j)
    {
        char [] b = a.toCharArray();

        char character;

        character = b[i];

        b[i] = b[j];

        b[j] = character;

        return String.valueOf(b);
    }

    public static void main(String [] args)
    {
        String string = "ABC";

        int length = string.length();

        System.out.println("All The Permutations of String are: ");

        generatePermutation(string, 0, length);
    }

    public static void generatePermutation(String string, int start, int end)
    {
        if(start == end - 1)
        {
            System.out.println(string);
        }
        else
        {
            for(int i = start; i < end; i++)
            {
                string = swapString(string, start, i);

                generatePermutation(string, start + 1, end);

                string = swapString(string, start, i);
            }
        }
    }
}