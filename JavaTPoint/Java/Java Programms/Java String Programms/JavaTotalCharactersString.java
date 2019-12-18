public class JavaTotalCharactersString
{
    public static void main(String [] args)
    {
        String string = "This is Huge ! That i am working on it !!";

        int count = 0;

        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i) != ' ')
            {
                count++;
            }
        }

        System.out.println("Total Number of Characters in a String: " + count);
    }
}