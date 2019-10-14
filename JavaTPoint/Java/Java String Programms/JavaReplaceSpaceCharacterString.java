public class JavaReplaceSpaceCharacterString
{
    public static void main(String [] args)
    {
        String string = "Trying to swap space from this sentence with other a character";

        char character = '-';

        string = string.replace(' ', character);

        System.out.println("String After Replacing Space: " + string);
    }
}