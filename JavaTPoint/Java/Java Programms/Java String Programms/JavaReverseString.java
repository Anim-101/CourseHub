public class JavaReverseString
{
    public static void main(String [] args)
    {
        String string = "Dream Big, Work Hard, Expect Little, Share More";

        String reversedString = "";

        for(int i = string.length() - 1; i > 0; i--)
        {
            reversedString = reversedString + string.charAt(i);
        }

        System.out.println("Original String: " + string);

        System.out.println("Reversed String: " + reversedString);
    }
}