public class JavaSwapString
{
    public static void main(String [] args)
    {
        String stringOne = "Good", stringTwo = "morning";

        System.out.println("Strings before Swapping: " + stringOne + stringTwo);

        stringOne = stringOne + stringTwo;

        stringTwo = stringOne.substring(0, (stringOne.length() - stringTwo.length()));

        stringOne = stringOne.substring(stringTwo.length());

        System.out.println("Strings after Swapping: " + stringOne + " " + stringTwo);
    }
}