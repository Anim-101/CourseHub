public class PalindromeNumber_Simple 
{
    public static void main(String [] args)
    {
        int reverse, sum = 0, temp;

        int number = 454;

        temp = number;

        while(number > 0)
        {
            reverse = number % 10;

            sum = (sum * 10) + reverse;

            number = number / 10;
        }

        if(temp == sum)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}