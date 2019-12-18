public class JavaPalindromeString
{
    public static void main(String [] args)
    {
        String string = "HeyeH";

        boolean flag = true;

        string = string.toLowerCase();

        for(int i = 0; i < string.length() / 2; i++)
        {
            if(string.charAt(i) != string.charAt(string.length() - i - 1))
            {
                flag = false;
            }
        }

        if(flag)
        {
            System.out.println("Given String is Plaindrome");
        }
        else
        {
            System.out.println("Given String is not a Palindrome");
        }
    }
}