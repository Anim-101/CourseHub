import java.util.*;

public class PalindromeNumber_Input
{
    public static void main(String [] args)
    {
        String original, reverse = "";
        
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a String/Number to Check if it is a Palindrome - ");

        original = scan.nextLine();

        int length = original.length();

        for(int i = length - 1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        if(original.equals(reverse))
        {
            System.out.println("Entered String/Number is a Palindrome Number");
        }
        else
        {
            System.out.println("Entered String/Number is not a Palindrome Number");
        }
    }
}