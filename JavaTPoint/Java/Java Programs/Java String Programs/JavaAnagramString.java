import java.util.Arrays;

public class JavaAnagramString
{
    public static void main(String [] args)
    {
        String stringOne = "Brag";

        String stringTwo = "Grab";

        stringOne = stringOne.toLowerCase();

        stringTwo = stringTwo.toLowerCase();

        if(stringOne.length() != stringTwo.length())
        {
            System.out.println("Both The Strings are not Anagram");

            System.out.println("I am Here BabiBy !!");
        }
        else
        {
            char[] stringFirst = stringOne.toCharArray();

            char[] stringSecond = stringTwo.toCharArray();

            Arrays.sort(stringFirst);

            Arrays.sort(stringSecond);

            if(Arrays.equals(stringFirst, stringSecond) == true)
            {
                System.out.println("Both Strings are Anagram");
            }
            else
            {
                System.out.println("Both Strings are not Anagram");
            }
        }
    }
}