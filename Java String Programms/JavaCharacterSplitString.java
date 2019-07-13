public class JavaCharacterSplitString
{
    public static void main(String [] args)
    {
        String string = "characters";

        System.out.println("Individual Characted in Given String:");

        for(int i = 0; i < string.length(); i++)
        {
            System.out.print(string.charAt(i) + " ");
        }
    }
}